package ru.yandex.zhmyd.dao.impl;

import org.hibernate.Session;
import ru.yandex.zhmyd.dao.AbstractHibernateDao;
import ru.yandex.zhmyd.dao.UserDao;
import ru.yandex.zhmyd.entity.User;

/**
 * Created by Aliaksandr_Zhmaidzia on 1/20/2016.
 */
public class UserDaoImpl extends AbstractHibernateDao<User,Long> implements UserDao {
    @Override
    public User getById(final Long id) {
        Session session = getSession();
        session.beginTransaction();
        User user = (User)  getSession().get(User.class, id);
        session.getTransaction().commit();
        return user;
    }
}
