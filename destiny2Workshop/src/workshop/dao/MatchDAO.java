package workshop.dao;

import junit.framework.TestCase;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import workshop.entity.Match;
import workshop.utiil.HibernateUtil;

import java.util.List;

public class MatchDAO {
    //添加一个配装方案
    public void insertMatch(Match match) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.save(match);

//            NativeQuery query = session.createNativeQuery("insert into `match` values (null,?,?)");
//            query.setParameter(1,match.getM_name());
//            query.setParameter(2, match.getM_list());
//            query.executeUpdate();

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //删除一个配装方案
    public void deleteMatch(int m_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Match match = session.get(Match.class, m_id);
            session.delete(match);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //修改一个配装方案
    public void updateMatch(Match match) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.update(match);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //查询一个配装方案对象
    public Match queryOneMatch(int m_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        Match match = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            match = session.get(Match.class, m_id);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return match;
    }

    //查询所有配装方案对象
    public List<Match> queryAllMatch() {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        List<Match> matchList = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Query<Match> query = session.createQuery("from Match", Match.class);
            matchList = query.list();

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return matchList;
    }

}
