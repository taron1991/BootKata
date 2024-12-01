package org.example.crudbootkata.web.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.example.crudbootkata.web.model.User;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


     @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> userList() {
        return entityManager.createQuery("from User").getResultList();
    }

    public User addUser(User user) {
        entityManager.merge(user);
        return user;
    }

    @Override
    public void delById(long usserId) {
        entityManager.createQuery("delete from User where id=:id").setParameter("id",usserId).executeUpdate();
    }

    public User findById(long userId){
        return entityManager.find(User.class,userId);
    }

}
