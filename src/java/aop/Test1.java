package aop;

import aop.librariesAndBooks.Book;
import aop.librariesAndBooks.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        /*использовали, когда метод getBook() принимал объкт Book в качестве параметра*/
        Book book = context.getBean("book", Book.class);


        /*get methods*/
        uniLibrary.getBook();
        System.out.println("------------------------------------------");
//        uniLibrary.getMagazine();
//        System.out.println("------------------------------------------");

        /*return methods*/
//        uniLibrary.returnBook();
//        System.out.println("------------------------------------------");
//        uniLibrary.returnMagazine();
//        System.out.println("------------------------------------------");

        /*add methods*/
        uniLibrary.addBook("Varya", book);
        System.out.println("------------------------------------------");
        uniLibrary.addMagazine();
        System.out.println("------------------------------------------");





        /*work with schoolLibrary class*/
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
