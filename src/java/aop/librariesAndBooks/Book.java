package aop.librariesAndBooks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Мертвые души")
    private String name;
    @Value("Николай Васильевич Гоголь")
    private String author;
    @Value("1842")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
