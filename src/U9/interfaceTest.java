package U9;

interface boat{
    public void f();        //灰色证明加不加无所谓，也就是说无论如何都是publi的
    //provate 禁止
    public void g();
    public void h();
}

class montana implements boat{
    montana(){
        f();
        g();
        h();
    }
    @Override
    public void f() {
        System.out.println("f()");
    }

    @Override
    public void g() {
        System.out.println("g()");
    }

    @Override
    public void h() {
        System.out.println("h()");
    }
}

public class interfaceTest {
    public static void main(String[] args) {
        montana montana = new montana();
    }
}
