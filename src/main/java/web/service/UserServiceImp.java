package web.service;

import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserServiceImp implements UserService{

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void createUser(String name, int flat) {
        User user = new User (name,flat);
        entityManager.getTransaction();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
    }

    @Transactional
    @Override
    public void updateUser(Long id, String name, int flat) {
        entityManager.getTransaction();
        User user1 = entityManager.find(User.class,id);
        user1.setName(name);
        user1.setFlat(flat);
        entityManager.persist(user1);
        entityManager.getTransaction().commit();
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        entityManager.getTransaction();
        User user1 = entityManager.find(User.class,id);
        entityManager.remove(user1);
        entityManager.getTransaction().commit();
    }

    @Transactional
    @Override
    public List getAllUser() {
        entityManager.getTransaction();
        List messages = entityManager.createQuery("SELECT * FROM Users ").getResultList();
        return messages;
    }



}
