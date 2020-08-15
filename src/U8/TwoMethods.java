package U8;

class two{
    public void method1(){
        System.out.println("method1");
        method2();
    }

    public void method2(){
        System.out.println("methods2");
    }
}

class daochu extends two{
    @Override
    public void method2() {
        System.out.println("extend");
    }
}

public class TwoMethods {
    public static void main(String[] args) {
        two two = new daochu();
        two.method1();
        //虽然，我没有调用第二个方法，但是，第一个方法调用了第二个导致了方法override
    }
}
