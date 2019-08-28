package aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
//@Aspect
public class AspectReturning {

    //@AfterReturning(pointcut = "@annotation(business.CustomAnnotation)", returning = "value")
    @AfterReturning(pointcut = "@target(business.CustomAnnotation)", returning = "value")
    public void normalReturningValue(Object value) {
        System.out.println("After returning with value: " + value);
    }
}
