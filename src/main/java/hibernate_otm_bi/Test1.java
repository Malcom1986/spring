package hibernate_otm_bi;


import hibernate_otm_bi.model.Department;
import hibernate_otm_bi.model.Employee;
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

//            var department = new Department("HR", 300, 1200);
//            var emp1 = new Employee("Jacky", "Flow", 800);
//            var emp2 = new Employee("Jane", "Brown", 600);
//            var emp3 = new Employee("Anna", "Smith", 400);
//            department.addEmployee(emp1);
//            department.addEmployee(emp2);
//            department.addEmployee(emp3);

            session.beginTransaction();

//            session.persist(department);

//            var dep = session.get(Department.class, 2);
            var emp = session.get(Employee.class, 3);
            System.out.println(emp.getDepartment());
//            System.out.println(dep.getEmps());
//            var emp = session.get(Employee.class, 2);
//            session.remove(emp);
//            System.out.println(dep);
//            System.out.println(dep.getEmps());
            System.out.println(emp);


            session.getTransaction().commit();

            System.out.println(emp.getDepartment());


        }
    }
}
