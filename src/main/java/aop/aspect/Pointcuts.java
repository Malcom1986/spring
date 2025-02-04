package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(public void add*(..))")
    public void allAddMethods() {}

}
