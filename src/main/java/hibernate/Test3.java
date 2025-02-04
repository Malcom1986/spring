package hibernate;

import aop.Library;
import hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();
            var name = "Elena";

            List<Employee> emps = session
                    .createSelectionQuery("from Employee where name = ?1 and salary > 799", Employee.class)
                    .setParameter(1, name)
                    .getResultList();

            emps.forEach(System.out::println);


            session.getTransaction().commit();




        }
    }
}
