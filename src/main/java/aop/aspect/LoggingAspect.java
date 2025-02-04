package aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    @Before("aop.aspect.Pointcuts.allAddMethods()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {
        var signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("SIGNATURE: " + signature);
        System.out.println(signature.getMethod());
        var args = joinPoint.getArgs();
        System.out.println("ARGS: " + Arrays.toString(args));

        System.out.println(GREEN + "[LOG INFO]: BeforeGetBookAdvice: try to get book" + RESET);
        System.out.println("-----------------------------------------");
    }
}
