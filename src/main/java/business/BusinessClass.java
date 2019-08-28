package business;

import oldTransversal.Permission;

public class BusinessClass {

    public void businessMethod1() {
        Permission.checkPermission();
        //Logic of businessMethod1
        System.out.println("BusinessMethod1");
    }

    public void businessMethod2() {
        Permission.checkPermission();
        //Logic of businessMethod2
        System.out.println("BusinessMethod2");
    }
}
