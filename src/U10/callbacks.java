package U10;

/**
 * 这个程序是用来实验回调的。
 * 仔细研究了这个程序感觉写的很棒
 * 2020年9月19日16:37:19
 * 再次人间迷惑……
 * 这个回调我直接写也做得到啊……具体详见call3
 * 2020年9月19日17:49:59
 * 不对劲，仔细看最后的结果。
 * 2020年9月19日18:08:06
 */

interface incrementable{        //接口
    void increment();           //接口方法
}

class call1 implements incrementable{   //第一个类实现接口
    private int i=0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class myincrement{                      //第二个类
    public void increment(){
        System.out.println("other idea");
    }
    static void f(myincrement m){
        m.increment();
    }
}

class call2 extends myincrement{
    private int i=0;
    @Override
    public void increment() {           //重写
        super.increment();
        i++;
        System.out.println(i);
    }

    /**
     * 看结果，这个结果是：
     * 接着之前的2  3
     * 而下面的那个则是重新开始的1  2
     * 这里给出书本的解释：
     * 如果call2继承了myincrement,就不能为了incrementable的用途而覆盖increment()方法
     * 于是只能使用内部类独立的实现incrementable
     */
    private class inner implements incrementable{       //内部类重写实现接口
        @Override
        public void increment() {                       //因为接口的方法和继承的方法重复了。
            call2.this.increment(); //可是你回去不就是原方法吗……？
        }
    }

    incrementable callback(){
        return new inner();
    }
}

/**
 * 我这一改，这就变成一个独立的方法了，这和之前的那个就没有什么关系了
 * 这不符合一开始书本里提到的例子的意思哦。
 * 2020年9月19日18:10:21
 */
class call3 extends myincrement implements incrementable{   //尝试继承+接口？这种东西之前写接口的时候不是写过了吗？
    private int i=0;
    @Override
    public void increment() {           //重写
        super.increment();
        i++;
        System.out.println(i);
    }

//    private class inner implements incrementable{       //内部类重写实现接口
//        @Override
//        public void increment() {                       //因为接口的方法和继承的方法重复了。
//            call2.this.increment();
//        }
//    }

//    incrementable callback(){
//        return new inner();
//    }
}

class call{
    private incrementable incrementable;

    public call(U10.incrementable incrementable) {
        this.incrementable = incrementable;
    }

    void go(){
        incrementable.increment();
    }
}

public class callbacks {
    public static void main(String[] args) {
        call1 call1 = new call1();
        call2 call2 = new call2();
        call3 call3 = new call3();

        myincrement.f(call2);

        call call11 = new call(call1);
        call call22 = new call(call2.callback());
        call call33 = new call(call3);
        System.out.println("==");
        call11.go();
        call11.go();
        System.out.println("==");
        call22.go();
        call22.go();
        System.out.println("==");
        call33.go();
        call33.go();
    }
}
