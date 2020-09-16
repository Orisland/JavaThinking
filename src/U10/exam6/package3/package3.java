package U10.exam6.package3;


import U10.exam6.package1.jiekou;
import U10.exam6.package2.package2;

public class package3 extends package2 {
    public jiekou getinner(){
        return new inner();
    }

    public static void main(String[] args) {
        new package3().getinner().f();

    }

}
