package org.example.crudbootkata.web.service;

import org.example.crudbootkata.web.model.User;

import java.util.List;

public interface UserService {
    List<User> userList();

    User addUser(User user);

    void delById(long usserId);

    User findById(long userId);
}
