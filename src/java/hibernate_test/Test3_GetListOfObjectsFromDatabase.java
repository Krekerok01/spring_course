package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3_GetListOfObjectsFromDatabase {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            /*получение всех данных из таблицы
             После from используется не название таблицы, а название класса*/
//            List<Employee> emps = session.createQuery("from Employee ").getResultList();

            /*получение данных из таблицы используя условие
             name - не название столбца, а название поля из класса Employee*/
//            List<Employee> emps = session.createQuery("from Employee " +
//                    "where name = 'Olga'").getResultList();

            List<Employee> emps = session.createQuery("from Employee " +
                    "where name = 'Varvara' AND salary > 300").getResultList();

            for (Employee e: emps){
                System.out.println(e);
            }

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
