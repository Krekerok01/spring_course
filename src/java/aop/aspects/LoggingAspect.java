package aop.aspects;

import aop.librariesAndBooks.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Before("aop.aspects.MyPointcuts.allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: логгирование попытки ПОЛУЧИТЬ книгу/журнал");
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature =  " + methodSignature);
        System.out.println("methodSignature.getMethod() =  " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() =  " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() =  " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Information about the book: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }


        System.out.println("beforeAddLoggingAdvice(): логгирование попытки ПОЛУЧИТЬ книгу/журнал");
        System.out.println("**************");
    }

    /* пишем pointcut'ы для всех методов кроме return*/
//    @Pointcut("execution(* aop.librariesAndBooks.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){ }
//
//    @Pointcut("execution(public void aop.librariesAndBooks.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){ }
//
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExpectReturnMagazineFromUniLibrary(){ }
//
//    @Before("allMethodsExpectReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExpectReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExpectReturnMagazineAdvice: writing Log#10");
//    }
    /*------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /* пишем pointcut'ы для  методов GET и RETURN и объединяем их*/
//    @Pointcut("execution(* aop.librariesAndBooks.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){ }
//
//    @Pointcut("execution(* aop.librariesAndBooks.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){ }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){ }
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log#1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log#2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log#3");
//    }
    /*------------------------------------------------------------------------------------------------------------------------------------------------------*/


//    /* пишем pointcut для методов GET и используем в нескольких местах.
//    В дальнейшем разделим этот участок кода на разные классы и он будет закомменчен*/
//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){ }
//
//    //в скобках указывается pointcut(это выражение, описывающее где должен быть применён Advice)
//    //get*(*) - любой параметр; get*(..) - любое количество параметров
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetBookAdvice: логгирование попытки ПОЛУЧИТЬ книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");
//    }
    /*------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /*разнавидность написания @Before*/
//    //@Before("execution(public void returnBook())")
//    //@Before("execution(public * returnBook())")
//    @Before("execution(* returnBook())")
//    //@Before("execution(* *())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeGetBookAdvice: попытка ВЕРНУТЬ книгу");
//    }
}
