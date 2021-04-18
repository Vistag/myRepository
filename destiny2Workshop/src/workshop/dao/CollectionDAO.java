package workshop.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import workshop.entity.Collection;
import workshop.utiil.HibernateUtil;

import java.util.List;

public class CollectionDAO {

    //添加一个收藏箱
    public void insertCollection(Collection collection) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.save(collection);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //删除一个收藏箱
    public void deleteCollection(int c_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Collection collection = session.get(Collection.class, c_id);
            session.delete(collection);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //修改一个collection
    public void updateCollection(Collection collection) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.update(collection);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //查询一个收藏箱对象
    public Collection queryOneCollection(int c_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        Collection collection = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            collection = session.get(Collection.class, c_id);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return collection;
    }

    //查询所有收藏箱对象
    public List<Collection> queryAllCollection() {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        List<Collection> collectionList = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Query<Collection> query = session.createQuery("from Collection", Collection.class);
            collectionList = query.list();

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return collectionList;
    }
}
