package business;

public class WrapperBusinessClass {
    BusinessClass businessClass = new BusinessClass();

    public void businessMethod1() {
        System.out.println("Before wrapper businessMethod1");
        businessClass.businessMethod1();
    }

    public void businessMethod2() {
        businessClass.businessMethod2();
        System.out.println("After wrapper businessMethod2");
    }
}
