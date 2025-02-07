package hibernate_oto;

import hibernate_oto.model.Detail;
import hibernate_oto.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//
//            var employee = new Employee("Teon", "Snow", "IT", 500);
//            var detail = new Detail("Grayjoy", "567567", "teon@ironisland.com");
//
//            detail.setEmployee(employee);
//            employee.setEmpDetail(detail);



//            session.beginTransaction();
//
//            session.persist(detail);
//
//            session.getTransaction().commit();



            session.beginTransaction();

            var detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.remove(detail);

            session.getTransaction().commit();

            System.out.println(detail.getEmployee());


        }
    }

}
