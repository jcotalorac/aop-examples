package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectLog {

    @Pointcut("execution(public void business.AOPBusinessClass.businessMethod3())")
    public void methodsAfter(){}

    @After("methodsAfter()")
    public int logAfter() {
        System.out.println("Logging after");
        return 0;
    }
}
