package aop.librariesAndBooks;

import aop.librariesAndBooks.AbstractLibrary;
import aop.librariesAndBooks.Book;
import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    /*get, return and add for BOOK*/
    public void getBook(){
        System.out.println("We are taking a book from UniLibrary ");
        System.out.println("**************");
    }

//    public void returnBook(){
//        System.out.println("We are returning a book to the UniLibrary");
//        System.out.println("**************");
//    }

    public String returnBook(){
        int a = 10 / 0;
        System.out.println("We are returning a book to the UniLibrary");
        return "Война и мир";
    }

    /*old method*/
//    public void addBook(){
//        System.out.println("We are adding a book from UniLibrary ");
//        System.out.println("**************");
//    }

    /*new method*/
    public void addBook(String personName, Book book){
        System.out.println("We are adding a book to the UniLibrary ");
        System.out.println("**************");
    }


    /*get, return and add for MAGAZINE*/
    public void getMagazine(){
        System.out.println("We are taking a magazine from UniLibrary");
        System.out.println("**************");
    }

    public void returnMagazine(){
        System.out.println("We are returning a magazine to the UniLibrary");
        System.out.println("**************");
    }

    public void addMagazine(){
        System.out.println("We are adding a magazine to the UniLibrary ");
        System.out.println("**************");
    }
}
