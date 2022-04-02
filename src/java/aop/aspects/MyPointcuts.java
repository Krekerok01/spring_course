package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
//    @Pointcut("execution(* get*())")
//    public void allGetMethods(){ }

    /* add меняем на  abc*/
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods(){ }

}
