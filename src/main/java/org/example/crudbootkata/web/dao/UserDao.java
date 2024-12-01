package org.example.crudbootkata.web.dao;

import org.example.crudbootkata.web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> userList();
    User addUser(User user);

    public void delById(long usserId);

    User findById(long userId);
}
