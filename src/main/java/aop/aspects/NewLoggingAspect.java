package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice - attempt to return book");
        System.out.println("--------------------------------------------------");

        long begin = System.currentTimeMillis();
        Object proceed;
        try {
            proceed = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("exception " + e + " in aroundReturnBookLoggingAdvice");
            throw e;
        }
        long end = System.currentTimeMillis();


        System.out.println("aroundReturnBookLoggingAdvice - book successfully returned");
        System.out.println("--------------------------------------------------");
        System.out.println("method returnBook took " + (end-begin) + " milis");

        return proceed;
    }
}
