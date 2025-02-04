package aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspect {

    @Before("aop.aspect.Pointcuts.allAddMethods()")
    public void beforeGetAdvice() {
        System.out.println("[Exception]: exception handling");
        System.out.println("-----------------------------------------");
    }
}
