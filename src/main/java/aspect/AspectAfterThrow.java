package aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
//@Aspect
public class AspectAfterThrow {

    @AfterThrowing(pointcut = "execution(public int business.AOPBusinessClass.businessMethod6())", throwing = "exc")
    public void afterException(Exception exc) {
        System.out.println("AfterThrowAspect");
        exc.printStackTrace();
    }
}
