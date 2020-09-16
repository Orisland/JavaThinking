package U10.exam6.package2;

import U10.exam6.package1.jiekou;

public class package2 {
    protected class inner implements jiekou {
        public inner() {
            System.out.println("inner create");
        }

        @Override
        public void f() {
            System.out.println("接口1");
        }
    }
}
