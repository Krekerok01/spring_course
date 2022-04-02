package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            /*Создали секцию, создали детей, добавили секциям детей, сохранили секцию -(х3)*/
//            session = sessionFactory.getCurrentSession();
//
//            Section section1  = new Section("Football");
//
//            Child roma = new Child("Roma", 10);
//            Child lera = new Child("Lera", 11);
//            Child emi = new Child("Emi", 15);
//
//            section1.addChildToSection(lera);
//            section1.addChildToSection(roma);
//            section1.addChildToSection(emi);
//
//
//
//            Section section2  = new Section("Chess");
//            Child alex = new Child("Alex", 9);
//            section2.addChildToSection(alex);
//
//
//            Section section3  = new Section("Dance");
//            Child varya = new Child("Varya", 8);
//            section3.addChildToSection(varya);
//
//
//            session.beginTransaction();
//
//            session.save(section1);
//            session.save(section2);
//            session.save(section3);
//
//            session.getTransaction().commit();


//*****************************************************************************************************************************

            /*Создали ребенка, создали секцию, добавили ребенку секции, сохранили ребенка */
//            session = sessionFactory.getCurrentSession();
//
//            Section section1  = new Section("Basketball");
//            Section section2  = new Section("Volleyball");
//            Section section3  = new Section("Math");
//
//            Child nik = new Child("Nik", 15);
//            nik.addSectionToChild(section1);
//            nik.addSectionToChild(section2);
//            nik.addSectionToChild(section3);
//
//
//            session.beginTransaction();
//
//            session.save(nik);
//            session.getTransaction().commit();


//*****************************************************************************************************************************
            /*Получение информации о детях через секцию*/
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();

//*****************************************************************************************************************************

            /*Получение информации о секциях через ребенка*/
//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 6);
//            System.out.println(child.getSections());
//
//
//            session.getTransaction().commit();

//*****************************************************************************************************************************

            /*
                После получения сессии, начинаем транзакцию сессии.
                Получаем из сессии работника.
                Удаляем работника. Закрываем сессию.

                Из-за того, что у классов департамент и работник был указан
                каскадный параметр - произошло удаление и всех работников и департамента.
                В следующем примере каскадный тип будет заменен.
            */

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            session.delete(section);
//
//
//            session.getTransaction().commit();


//*****************************************************************************************************************************

            /*Переделанный первый пример. После изменения каскадного параметра всех детей надо сохранять вручную*/
//            session = sessionFactory.getCurrentSession();
//
//            Section section1  = new Section("Football");
//
//            Child roma = new Child("Roma", 10);
//            Child lera = new Child("Lera", 11);
//            Child emi = new Child("Emi", 15);
//
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            section1.addChildToSection(lera);
//            section1.addChildToSection(roma);
//            section1.addChildToSection(emi);
//
//            session.save(roma);
//            session.save(lera);
//            session.save(emi);
//
//
//            session.getTransaction().commit();


//*****************************************************************************************************************************

            /*Переделанный прошлый пример. Заменяем метод save() для сохранения каскадного сохранения.*/
//            session = sessionFactory.getCurrentSession();
//
//            Section section1  = new Section("Drawing");
//
//            Child igor = new Child("Igor", 13);
//            Child pit = new Child("Pit", 14);
//
//            section1.addChildToSection(pit);
//            section1.addChildToSection(igor);
//
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();


//*****************************************************************************************************************************
            /*Удаление секции рисования.*/


//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 10);
//            session.delete(section);
//
//            session.getTransaction().commit();


//*****************************************************************************************************************************
            /*Удаление ребенка с id 5.*/

//            session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 5);
//            session.delete(child);
//
//            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
