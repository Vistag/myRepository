package workshop.utiil;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    //SessionFactory的单态模式
    private static SessionFactory sf = null;
    private static Configuration cfg = null;

    static {
        //在类加载的时候只执行一次
        try {
            cfg = new Configuration().configure();
            sf = cfg.buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sf;
    }

}
