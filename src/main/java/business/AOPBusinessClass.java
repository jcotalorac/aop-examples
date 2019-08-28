package business;

import org.springframework.stereotype.Component;

@Component
@CustomAnnotation
public class AOPBusinessClass {

    public void businessMethod1() {
        System.out.println("BusinessMethod1");
    }

    public void businessMethod2() {
        System.out.println("BusinessMethod2");
    }

    public void businessMethod3() {
        System.out.println("BusinessMethod3");
    }

    public int businessMethod4() {
        System.out.println("BusinessMethod4");
        return 4444;
    }

    //@CustomAnnotation
    public int businessMethod5() {
        System.out.println("BusinessMethod5");
        return 5555;
    }

    public int businessMethod6() {
        System.out.println("BusinessMethod6");
        return 0/0;
    }
}
