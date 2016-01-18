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

        User user = (User) session.get(User.class, 1L);
        //System.out.println(user);
/*        for (int i = 0;i<1000;i++){
            User user = new User();
            user.setName("User"+i);
            session.saveOrUpdate(user);
        }*/
        transaction.commit();

        HibernateUtil.close();

        System.out.println(user);

    }
}
