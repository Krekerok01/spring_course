package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5_DeleteObjects {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            /*способ удаляет один объект*/
//            Employee employee = session.get(Employee.class, 8);
//            session.delete(employee);


            /*удаляет по определенному условию*/
//            session.createQuery("delete Employee " +
//                    "where id>4").executeUpdate();
            session.createQuery("delete Employee " +
                    "where name = 'Yen'").executeUpdate();


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
