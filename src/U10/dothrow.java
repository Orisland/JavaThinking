package U10;

/**
 * 丢筛子丢硬币重置版
 * 2020年9月18日18:32:27
 * 这不是照着瞎写吗……
 * 2020年9月18日18:42:19
 */

interface method{
    void coin();
    void dice();
}

interface dothat{
    method get();
}

class doit1 implements method{
    @Override
    public void coin() {
        System.out.println("put coin1");
    }

    @Override
    public void dice() {
        System.out.println("put dice1");
    }

    dothat dothat = new dothat() {
        @Override
        public method get() {
            return new doit1();
        }
    };
}

class doit2 implements method{
    @Override
    public void coin() {
        System.out.println("put coin2");
    }

    @Override
    public void dice() {
        System.out.println("put dice2");
    }

    dothat dothat = new dothat() {
        @Override
        public method get() {
            return new doit2();
        }
    };
}

public class dothrow {
    public void getit(dothat dothat){
        method method = dothat.get();
        method.coin();
        method.dice();
    }

    public static void main(String[] args) {
        dothrow dothrow = new dothrow();
        dothrow.getit(new doit1().dothat);
        dothrow.getit(new doit2().dothat);
    }
}
