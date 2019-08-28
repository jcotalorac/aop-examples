package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LayerAspect {


    @Pointcut("within(com.layers.aop.aspect.web..*)")
    public void inWebLayer() {}

    @Pointcut("within(com.layers.aop.aspect.service..*)")
    public void inServiceLayer() {}

    @Pointcut("within(com.layers.aop.aspect.dao..*)")
    public void inDataAccessLayer() {}

    @Pointcut("execution(* com.layers.aop.aspect.service.*.*(..))")
    public void businessService() {}

    @Pointcut("execution(* com.layers.aop.aspect.dao.*.*(..))")
    public void dataAccessOperation() {}

}
