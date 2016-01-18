package ru.yandex.zhmyd;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.yandex.zhmyd.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction =session.beginTransaction();

        User user = (User) session.get(User.class, 2L);

        User empl = (User) session.get(User.class, 8L);

        empl.setBoss(user);

       System.out.println(user);
        transaction.commit();

        HibernateUtil.close();

       System.out.println(user);

    }
}
