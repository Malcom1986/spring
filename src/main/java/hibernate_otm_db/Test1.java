package hibernate_otm_db;


import hibernate_otm_db.model.Department;
import hibernate_otm_db.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            var department = new Department("IT", 300, 1200);
//            var emp1 = new Employee("John", "Snow", 800);
//            var emp2 = new Employee("Jane", "Brown", 600);
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);

            session.beginTransaction();

//            session.persist(department);

//            var dep = session.get(Department.class, 1);
//            System.out.println(dep);
//            System.out.println(dep.getEmps());
            var emp = session.get(Employee.class, 2);
            session.remove(emp);

            session.getTransaction().commit();

        }
    }
}
