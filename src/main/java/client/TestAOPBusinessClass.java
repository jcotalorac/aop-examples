package client;

import business.AOPBusinessClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "business,aspect")
public class TestAOPBusinessClass {

    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(TestAOPBusinessClass.class);

        AOPBusinessClass aopBusinessClass = context.getBean(AOPBusinessClass.class);

        //aopBusinessClass.businessMethod1();
        //aopBusinessClass.businessMethod2();

        //aopBusinessClass.businessMethod3();

        //aopBusinessClass.businessMethod4();

        //aopBusinessClass.businessMethod5();
        //aopBusinessClass.businessMethod6();

    }


}
