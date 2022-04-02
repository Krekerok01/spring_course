package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2_GetObjectFromDatabase {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Olga", "Tufecsi", "IT", 420);

            session.beginTransaction();

            session.save(emp);
            int myId = emp.getId();
            Employee employee = session.get(Employee.class, myId);
            //Employee employee = session.get(Employee.class, 10);

            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!");


//            Session session = factory.getCurrentSession();
//
//            Employee emp = new Employee("Kirill", "Raihe", "Sales", 270);
//
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//
//            int myId = emp.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            /*получение объекта из базы по id*/
//            Employee employee = session.get(Employee.class, 1);
//            session.getTransaction().commit();
//            System.out.println(employee);
//
//            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
