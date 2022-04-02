package hibernate_one_to_many_UNI;



import hibernate_one_to_many_UNI.entity.Department;
import hibernate_one_to_many_UNI.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_UniDirectional {
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
//            Department dep = new Department("HR", 600, 2000);
//
//            Employee employee1 = new Employee("Emi", "Loska", 1900);
//            Employee employee2 = new Employee("Alex", "Zubov", 800);
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
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//*********************************************************************************************************************************

            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии работника.
                Выводим на экран работника. Закрываем сессию.
            */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 3);
//            System.out.println(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//*********************************************************************************************************************************

            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии работника.
                Удаляем работника. Закрываем сессию.

                В данном примере была односторонняя связь, соответственно,
                при удалении департамента - удаляется и департамент и работники связанные с ним,
                а при удалении работника - удаляется лишь работник.
            */
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 3);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");



//*********************************************************************************************************************************

            /*Удаление всех данных из таблицы с помощью удаления департаментов.*/
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 3);
            Department department2 = session.get(Department.class, 2);
            session.delete(department2);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            //закрываем фабрику
            factory.close();
        }
    }
}
