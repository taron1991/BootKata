package org.example.crudbootkata.web.service;

import org.example.crudbootkata.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.example.crudbootkata.web.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> userList() {
        return userDao.userList();
    }

    @Transactional
    public User addUser(User user){
        return userDao.addUser(user);
    }

    @Transactional
    public void delById(long usserId){
        userDao.delById(usserId);
    }

    public User findById(long userId){
        return userDao.findById(userId);
    }
}
