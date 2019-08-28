package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
//@Aspect
public class AspectAround {

    @Around("within(business.*) && execution(public int business.*.*())")
    public Object aroundExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Action before");
        Object returnValue = proceedingJoinPoint.proceed();
        System.out.println("Action after with value: " + returnValue);
        return returnValue;
    }
}
