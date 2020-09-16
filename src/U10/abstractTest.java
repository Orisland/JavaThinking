package U10;

/**
 * 学着学着给学忘了，abstract类不能被new
 * abstract和interface的区别就是abstract里可以写具体的方法，包括……包括构造器？？
 * 不是……abstract不是不能被new吗，那你这个破构造器有什么作用吗……
 * 2020年9月16日16:28:34
 * 爬，可以。
 * 2020年9月16日16:30:25
 */

abstract class make{
    public make(int i) {
        System.out.println("make "+ i);
    }

    abstract void f();
}

public class abstractTest {

    public static make getmake(){
        return new make(1) {
            @Override
            void f() {
                System.out.println("make f()");
            }
        };
    }

    public static void main(String[] args) {
//        new make();
        getmake();
    }
}
