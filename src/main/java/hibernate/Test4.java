package hibernate;

import hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            var emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);

            session.createMutationQuery("update Employee set salary = 3000 where name = :name")
                    .setParameter("name", "Elena")
                    .executeUpdate();


            session.getTransaction().commit();


        }
    }
}
