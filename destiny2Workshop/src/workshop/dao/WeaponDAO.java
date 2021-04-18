package workshop.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import workshop.entity.Match;
import workshop.entity.Weapon;
import workshop.utiil.HibernateUtil;

import java.util.List;

public class WeaponDAO {

    //添加一个装备
    public void insertWeapon(Weapon weapon) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.save(weapon);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //删除一个装备信息
    public void deleteWeapon(int p_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Weapon weapon = session.get(Weapon.class, p_id);
            session.delete(weapon);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //修改一个装备信息
    public void updateWeapon(Weapon weapon) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            session.update(weapon);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    //查询一个装备对象
    public Weapon queryOneWeapon(int p_id) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        Weapon weapon = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            weapon = session.get(Weapon.class, p_id);

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return weapon;
    }

    //查询所有装备对象
    public List<Weapon> queryAllWeapon() {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        List<Weapon> weaponList = null;

        Match match = new Match();
        Weapon weapon = new Weapon();
        weapon.setW_name("牵引器火炮");
        weapon.setType("霰弹枪");
        weapon.setTime("");
//        weapon.setMatch();
        try {
            sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();

            Query<Weapon> query = session.createQuery("from Weapon", Weapon.class);
            weaponList = query.list();

            transaction.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }

        return weaponList;
    }


}
