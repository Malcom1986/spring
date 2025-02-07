package hibernate_oto;

import hibernate_oto.model.Detail;
import hibernate_oto.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//
//            var employee = new Employee("Jonh", "Snow", "IT", 500);
//            var detail = new Detail("Winterfall", "12345678", "john@snow.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();

//
//            var employee = new Employee("Aria", "Stark", "HR", 300);
//            var detail = new Detail("Winterfall", "237234234", "aria@stark.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();


            session.beginTransaction();

            var emp = session.get(Employee.class, 2);
            session.remove(emp);

            session.getTransaction().commit();

            System.out.println(emp.getEmpDetail());


        }
    }
}
