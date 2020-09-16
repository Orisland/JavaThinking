package U10;

/**
 * .new在内部类里的用法
 * 2020年9月14日19:55:26
 */

public class dotnew {
    class inner{
        public inner() {
            System.out.println("create inner!");
        }
    }

    public static void main(String[] args) {
        dotnew dotnew = new dotnew();
        dotnew.inner inner = dotnew.new inner();        //……？为啥不直接创建呢?
        //inner inner1 = new inner();                   //因为报错……
    }
}
