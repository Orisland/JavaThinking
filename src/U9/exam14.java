package U9;

interface basic1{
    void f();
    void g();
}

interface basic2{
    void h();
    void j();
}

interface basic3{
    void b();
    void c();
}

interface basic4 extends basic1,basic2,basic3{
    void d();
}

class Test{
    String out;
    Test(String out){
        this.out = out;
    }
}

abstract class Test1{
    String out;
    Test1(String out){
        this.out = out;
    }
    abstract void af();
}

class shixian2 extends Test1 implements basic4{
    shixian2(String out) {
        super("shixian2");
    }

    @Override
    public void f() {
        System.out.println("basic1 f");
    }

    @Override
    public void g() {
        System.out.println("basic1 g");
    }

    @Override
    public void h() {
        System.out.println("basic2 h");
    }

    @Override
    public void j() {
        System.out.println("basic2 j");
    }

    @Override
    public void b() {
        System.out.println("basic3 b");
    }

    @Override
    public void c() {
        System.out.println("basic3 c");
    }

    @Override
    public void d() {
        System.out.println("basic4 d");
    }

    @Override
    void af() {
        System.out.println("af");
    }
}

class shixian extends Test implements basic4{
    shixian(String out) {
        super("all");
    }

    @Override
    public void f() {
        System.out.println("basic1 f");
    }

    @Override
    public void g() {
        System.out.println("basic1 g");
    }

    @Override
    public void h() {
        System.out.println("basic2 h");
    }

    @Override
    public void j() {
        System.out.println("basic2 j");
    }

    @Override
    public void b() {
        System.out.println("basic3 b");
    }

    @Override
    public void c() {
        System.out.println("basic3 c");
    }

    @Override
    public void d() {
        System.out.println("basic4 d");
    }
}

public class exam14 {
    public static void f1(basic1 x){x.f();}
    public static void h1(basic2 x){x.h();}
    public static void b1(basic3 x){x.b();}
    public static void d1(basic4 x){x.d();}
    public static void all(shixian x){
        x.b();
        x.c();
        x.d();
        x.f();
        x.g();
        x.h();
        x.j();
    }

    public static void main(String[] args) {
        shixian shixian = new shixian("jutishixian");
        f1(shixian);
        h1(shixian);
        b1(shixian);
        d1(shixian);
        System.out.println("===========");
        all(shixian);
        System.out.println("========shixian2========");
        shixian2 shixian2 = new shixian2("shixian2");
        shixian2.af();
    }
}
