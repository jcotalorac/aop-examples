package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@Aspect
public class AspectPermission {

    @Before("execution(public void business.*.*())")
    public void checkPermission() {
        System.out.println("Checking Permission");
    }


}
