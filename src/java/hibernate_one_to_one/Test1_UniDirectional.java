package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_UniDirectional {
    public static void main(String[] args) {
        //создаем фабрику сессий
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;
        try {
            /*Первое добавление*/
//            //создаем сессию
//            Session session = factory.getCurrentSession();
//
//            /*до начала сессии создаем нужные нам объекты и связываем их между собой*/
//            Employee employee = new Employee("Varya", "Mamatsiuk", "IT", 900);
//            Detail detail = new Detail("Minsk", "375442566998", "matyush2001@gmail.com");
//            employee.setEmpDetail(detail);
//
//            //начинаем сессию
//            session.beginTransaction();
//
//            //сохраняем объект в сессии
//            session.save(employee);
//
//            //заканчиваем сессию
//            session.getTransaction().commit();
//            System.out.println("Done!");


            /*Второе добавление*/
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Nikita", "Mamatsiuk", "Sales", 900);
//            Detail detail = new Detail("Minsk", "375259887456", "niksson01@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(employee);

//            session.getTransaction().commit();
//            System.out.println("Done!");


            /*Первое получение объекта из базы*/
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("Done!");


            /*Второе получение объекта из базы и удаление его*/
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);
//
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


        } finally {
            session.close();
            //закрываем фабрику
            factory.close();
        }
    }
}
