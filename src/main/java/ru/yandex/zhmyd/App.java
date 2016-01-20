package ru.yandex.zhmyd;

import ru.yandex.zhmyd.dao.UserDao;
import ru.yandex.zhmyd.dao.impl.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  //      Session session = HibernateUtil.getSessionFactory().openSession();

  //      Transaction transaction =session.beginTransaction();

       // User empl = (User) session.get(User.class, 8L);

      //  empl.setBoss((User) session.byId(User.class).getReference(2L));
      //  System.out.println(empl);

        //List<User> userList = (List<User>) session.createCriteria(User.class).createAlias("boss", "b").add(Restrictions.eq("b.id", 1L)).list();
        UserDao dao = new UserDaoImpl();
        System.out.println(dao.getById(9L));
  ///      transaction.commit();

   //     HibernateUtil.close();
     //   System.out.println(userList);
     //  System.out.println(empl);

    }
}
