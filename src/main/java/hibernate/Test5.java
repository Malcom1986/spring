package hibernate;

import hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {

    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            var emp = session.get(Employee.class, 1);
//            session.remove(emp);

            session.createMutationQuery("delete from Employee where name = :name")
                    .setParameter("name", "Viktor").executeUpdate();

            session.getTransaction().commit();


        }
    }
}
