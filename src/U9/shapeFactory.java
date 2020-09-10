package U9;

/**
 * 工厂模式例子
 * exam18
 * 要求我做一个形状转化的，但是要用工厂模式……？
 * 我还是没太搞懂这个工厂化带来的好处。
 * 希望后来的几个例子能告诉我这么做的优点和好处是什么
 * 2020年9月10日11:02:53
 */

interface cycle{
    void f();
}

interface cycfactory{
    cycle getcycle();
}

class uncycle implements cycle{
    @Override
    public void f() {
        System.out.println("uncycle f()");
    }
}
class uncyclefactor implements cycfactory{
    @Override
    public cycle getcycle() {
        return new uncycle();
    }
}

class bicycle implements cycle{
    @Override
    public void f() {
        System.out.println("bicycle f()");
    }
}

class bicyclefactory implements cycfactory{
    @Override
    public cycle getcycle() {
        return new bicycle();
    }
}

class tricycle implements cycle{
    @Override
    public void f() {
        System.out.println("tricycle f()");
    }
}

class tricyclefactory implements cycfactory{
    @Override
    public cycle getcycle() {
        return new tricycle();
    }
}

public class shapeFactory {
    static void output(cycfactory cycfactory){
        cycle cycle = cycfactory.getcycle();
        cycle.f();
    }

    public static void main(String[] args) {
        output(new tricyclefactory());
        output(new uncyclefactor());
        output(new bicyclefactory());
    }
}
