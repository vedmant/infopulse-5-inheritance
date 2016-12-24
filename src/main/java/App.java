import entity.Admin;
import entity.BadUser;
import entity.User;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User user = new User();
        user.setName("John");
        user.setLogin("john");
        user.setPassword("123");

        BadUser badUser = new BadUser();
        badUser.setName("Bad");
        badUser.setLogin("bad");
        badUser.setPassword("123");
        badUser.setDebt("123");

        Admin admin = new Admin();
        admin.setName("Bad");
        admin.setLogin("bad");
        admin.setPassword("123");

        entityManager.persist(user);
        entityManager.persist(badUser);
        entityManager.persist(admin);

        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();
    }
}
