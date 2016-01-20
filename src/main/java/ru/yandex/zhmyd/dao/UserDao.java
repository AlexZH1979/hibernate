package ru.yandex.zhmyd.dao;

import ru.yandex.zhmyd.entity.User;

/**
 * Created by Aliaksandr_Zhmaidzia on 1/20/2016.
 */
public interface UserDao {
    User getById(Long id);
}
