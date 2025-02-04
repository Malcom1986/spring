package hibernate;

import hibernate.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {

            Session session = factory.getCurrentSession();

            var emp = new Employee("Oleg", "Sidorov", "HR", 500);

            session.beginTransaction();
            session.persist(emp);
//            session.getTransaction().commit();

            var id = emp.getId();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
            var employee = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(employee);



        }
    }
}
