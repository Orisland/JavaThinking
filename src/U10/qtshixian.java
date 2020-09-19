package U10;

/**
 * wait what？？？？？
 * 这都可以的吗，我看傻了
 * 2020年9月18日19:37:32
 * exam20
 * exam21
 * tips:
 * 请注意，我们使用匿名内部类来实现接口I。
 * 通常，更清晰地列出接口的所有方法，然后定义嵌套的类。
 * 2020年9月18日19:51:50
 */

public interface qtshixian {
    void what();
    class shixian implements qtshixian{
        @Override
        public void what() {
            System.out.println("这都可以？？？？");
        }

        public static void main(String[] args) {
            shixian shixian = new shixian();
            shixian.what();
        }
    }
}

interface qt2{
    void funny();
    class qt{
        static void f(qt2 i){
            i.funny();
        }
    }
}

class newqt implements qtshixian{
    @Override
    public void what() {
        System.out.println("新的套娃出现了！");
    }

    public static void main(String[] args) {
        newqt newqt = new newqt();
        newqt.what();
        qtshixian.shixian shixian = new qtshixian.shixian();
        shixian.what();
    }
}

class qt2n{
    public static void main(String[] args) {
        qt2 qt21 = new qt2() {
            @Override
            public void funny() {
                System.out.println("funny?");
            }
        };
        new qt2.qt();
        qt2.qt.f(qt21);
    }
}