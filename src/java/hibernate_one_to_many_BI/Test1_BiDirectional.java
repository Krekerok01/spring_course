package hibernate_one_to_many_BI;


import hibernate_one_to_many_BI.entity.Department;
import hibernate_one_to_many_BI.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_BiDirectional {
    public static void main(String[] args) {
        //создаем фабрику сессий
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = null;
        try {
            /*
                После получения сессии, создаем департамент и двух работников.
                Добавляем работников в департамент.
                Начинаем транзакцию сессии. Сохраняем департамент.
                Закрываем сессию.
            */
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("IT", 700, 3500);
//
//            Employee employee1 = new Employee("Varya", "Mamatsiuk", 1200);
//            Employee employee2 = new Employee("Nikita", "Mamatsiuk", 1350);
//
//            dep.addEmployeeToDepartment(employee1);
//            dep.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//*********************************************************************************************************************************


            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии департамент.
                Выводим на экран департамент и лист работников. Закрываем сессию.
            */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//*********************************************************************************************************************************

            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии работника.
                Выводим на экран работника и департамент. Закрываем сессию.
            */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//*********************************************************************************************************************************

            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии работника.
                Удаляем работника. Закрываем сессию.

                Из-за того, что у классов департамент и работник был указан
                каскадный параметр - произошло удаление и всех работников и департамента.
                В следующем примере каскадный тип будет заменен.
            */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");



//*********************************************************************************************************************************


            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии работника.
                Удаляем работника. Закрываем сессию.

                Из-за того, что у классов департамент и работник был указан
                каскадный параметр - произошло удаление и всех работников и департамента.
                В следующем примере каскадный тип будет заменен.
            */
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 4);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");


        } finally {
            session.close();
            //закрываем фабрику
            factory.close();
        }
    }
}
