package workshop.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import workshop.entity.Player;
import workshop.utiil.HibernateUtil;

import java.util.List;

public class PlayerDAO {

    //添加一个玩家
    public void insertPlayer(Player player) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.save(player);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //删除一个玩家信息
    public void deletePlayer(int p_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Player player = session.get(Player.class, p_id);
            session.delete(player);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //修改一个玩家信息
    public void updatePlayer(Player player) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.update(player);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //查询一个玩家对象
    public Player queryOnePlayer(int p_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        Player player = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            player = session.get(Player.class, p_id);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return player;
    }

    //查询所有玩家对象
    public List<Player> queryAllPlayer() {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        List<Player> playerList = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Query<Player> query = session.createQuery("from Player", Player.class);
            playerList = query.list();

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return playerList;
    }

}
