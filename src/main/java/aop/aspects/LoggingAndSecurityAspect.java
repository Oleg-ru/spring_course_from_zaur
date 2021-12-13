package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromLibrary() {}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromLibrary() {}

    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
    private void allGetAndReturnMethodsFromLibrary(){}

    @Before("allGetMethodsFromLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }







//    @Pointcut("execution(* get*())")
//    private void allGetMethod() {}
//
//    @Before("allGetMethod()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу\\журнал'");
//    }
//
//    @Before("allGetMethod())")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книги\\журнала");
//    }
}
