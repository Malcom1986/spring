package hibernate;

import hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();

            var emp = new Employee("Viktor", "Aaa", "IT", 1000);

            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
            System.out.println(emp);
        }
    }
}
