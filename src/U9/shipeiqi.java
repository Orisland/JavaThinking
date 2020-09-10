package U9;
//https://blog.csdn.net/mrkohaku/article/details/79087688
class adaptee{
    public void f(){        //这里必须有public
        System.out.println("method f()");
    }
}

interface target{
    void f();       //之前的f()
    void g();       //需要的g()
}

class Use1 implements target{       //把类封装进去
    private adaptee adaptee;
    Use1(adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void f() {
        adaptee.f();                //回调
    }

    @Override
    public void g() {
        System.out.println("method g");
    }
}

class Use extends adaptee implements target{
    @Override
    public void g() {   //加上g()
        System.out.println("method g()");
    }
}

public class shipeiqi{
    public static void main(String[] args) {
        Use use = new Use();        //这样就都可以用了
        use.g();
        use.f();
        System.out.println("=====");
        Use1 use1 = new Use1(new adaptee());
        use1.f();
        use1.g();
    }
}
