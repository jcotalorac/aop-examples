# aop-examples

Examples for AOP with spring in standalone mode.

The aspects are initally disabled. Please, enable each of one to see in detail
how is working.

//@Aspect   **<-------**

public class AspectPermission {

    @Before("execution(public void business.*.*())")
    public void checkPermission() {
        System.out.println("Checking Permission");
    }
}

Each one of business methods of AOPBusinessClass are associated with some
aspect by this way:

BusinessMethods 1 and 2: AspectPermission

BusinessMethod 3: AspectLog

BusinessMethod 4: AspectAround

BusinessMethod 6: AspectAfterThrow

BusinessMethod 5: AspectReturning
