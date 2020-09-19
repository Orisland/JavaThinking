package U10;

/**
 * 你想表达什么……？
 * 2020年9月19日15:49:24
 */

interface U{
    void f();
    void h();
    void g();
}

class A{
    U back(){
        return new U() {
            @Override
            public void f() {
                System.out.println("AF");
            }

            @Override
            public void h() {
                System.out.println("AH");
            }

            @Override
            public void g() {
                System.out.println("AG");
            }
        };
    }
}

class B{
    private U[] u = new U[10];
    void add(U x){
        for (int i=0; i<u.length; i++){
            if (u[i] == null){
                u[i] = x;
                return;
            }
        }
    }

    void zero(){
        u = null;
    }

    void output(){
        for (U x: u){
            x.f();
            x.g();
            x.h();
            System.out.println("====");
        }
    }
}

public class exam23 {
    public static void main(String[] args) {
        B b = new B();
        for (int i=0; i<10; i++){
            b.add(new A().back());
        }
        b.output();
    }
}
