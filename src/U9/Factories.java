package U9;

/**有一说一
 * 我是真的对这种工厂模式有些不理解
 * 为什么需要采取这种方式来书写代码呢？
 * 这么做有什么好处呢？
 * 但是不可否认，这种方法广泛的适用于Mc的编程里。
 * 可是这种程序的方式我依然一知半解，为什么需要这样，这么做的好处到底是什么？
 * 这么做的意义是什么？？？
 * 2020年9月10日10:33:10
 */

interface service{
    void method1();
    void method2();
}

interface servicefactory{
    service getservice();
}

class implement1 implements service{
    @Override
    public void method1() {
        System.out.println("implement1 method1");
    }

    @Override
    public void method2() {
        System.out.println("implement1 method2");
    }
}

class implement1Factor implements servicefactory{
    @Override
    public service getservice() {
        return new implement1();
    }
}

class implement2 implements service{
    @Override
    public void method1() {
        System.out.println("implement2 method1");
    }

    @Override
    public void method2() {
        System.out.println("implement2 method2");
    }
}

class implement2Factor implements servicefactory{
    @Override
    public service getservice() {
        return new implement2();
    }
}

public class Factories {
    static void servicermothod(servicefactory factory){
        service service = factory.getservice();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        servicermothod(new implement1Factor());
        servicermothod(new implement2Factor());
    }

}
