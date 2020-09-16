package U10;

interface jiekou{
    void f();
}

public class exam9 {
    class inner implements jiekou{
        @Override
        public void f() {
            System.out.println("f()");
        }
    }

    jiekou get(){
        return new inner();
    }

    public static void main(String[] args) {
        new exam9().get().f();
    }
}
