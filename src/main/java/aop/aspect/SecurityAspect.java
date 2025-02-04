package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspect.Pointcuts.allAddMethods()")
    public void securityAdvice() {
        System.out.println("[SECURITY]: SecurityAdvice: try to get book");
        System.out.println("-----------------------------------------");
    }
}
