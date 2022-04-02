package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2_BiDirectional {
    public static void main(String[] args) {
        //создаем фабрику сессий
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();


        Session session = null;
        try {
            /*Добаление данных в таблицу. Двусторонняя связь*/
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Vlad", "Cehanovich", "QA", 820);
//            Detail detail = new Detail("Tashkent", "265982569874", "vladik@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//
//
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            /*Получение данных из таблиц*/
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            /*Удаление из таблиц деталей и работника*/
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 4);
//            session.delete(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            /*Получаем детаои по id, разрываем связь между таблицами и удаляем только детали. Работник остается*/
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 1);
//            detail.getEmployee().setEmpDetail(null);
//            session.delete(detail);
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
