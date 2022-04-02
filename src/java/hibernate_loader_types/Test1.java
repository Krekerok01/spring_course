package hibernate_loader_types;



import hibernate_loader_types.entity.Department;
import hibernate_loader_types.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        //создаем фабрику сессий
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = null;
        try {
//            /*
//                После получения сессии, создаем департамент и двух работников.
//                Добавляем работников в департамент.
//                Начинаем транзакцию сессии. Сохраняем департамент.
//                Закрываем сессию.
//            */
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("Sales", 700, 2500);
//
//            Employee employee1 = new Employee("Varya", "Mamatsiuk", 1200);
//            Employee employee2 = new Employee("Nikita", "Mamatsiuk", 1350);
//            Employee employee3 = new Employee("Elena", "Smirnova", 1350);
//
//            dep.addEmployeeToDepartment(employee1);
//            dep.addEmployeeToDepartment(employee2);
//            dep.addEmployeeToDepartment(employee3);
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
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 5);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгрузим работников");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");

        } finally {
            session.close();
            //закрываем фабрику
            factory.close();
        }
    }
}
