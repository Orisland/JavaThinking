package U9;

abstract class chouxiang{       //空方法
}

abstract class chouxiang2{
    abstract void f();          //自带抽象方法
}

class extend1 extends chouxiang{
    public void f(){
        System.out.println("extend1");
    }
}

class extend2 extends chouxiang2{
    @Override
    void f() {
        System.out.println("extend2");
    }
}

class cxdc{
    public static void f(chouxiang chouxiang){
        ((extend1)chouxiang).f();       //这个需要向上转型
    }

    public static void g(chouxiang2 chouxiang2){
        chouxiang2.f();                 //但是这个不需要，直接就能用;
    }                                   //虽然在基类里是抽象的，但是已经在子类重写了

}

public class AbstractTest_1 {
    public static void main(String[] args) {
//        cxdc cxdc = new cxdc();
//        cxdc.fg();      //不需要输入
        chouxiang chouxiang = new extend1();
        cxdc.f(chouxiang);
        chouxiang2 chouxiang2 = new extend2();
        cxdc.g(chouxiang2);

    }
}
