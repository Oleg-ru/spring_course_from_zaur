package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint point) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книгу");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = point.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice: метод " + point.getSignature() + " работал " + (end - begin) + " ms");

        return targetMethodResult;
    }
}
