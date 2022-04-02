package aop.librariesAndBooks;

import aop.librariesAndBooks.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    //@Override
    public void getBook() {
        System.out.println("We are taking a book from SchoolLibrary");
    }
}
