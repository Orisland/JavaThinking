package U10;

public class exam5 {
    public exam5() {
        System.out.println("exam5");
    }

    class inner{
        public inner() {
            System.out.println("inner");
        }
    }
}

class other{
    public static void main(String[] args) {
        exam5.inner inner = new exam5().new inner();
    }
}
 