package U10;

/**
 * 2020年9月18日17:38:42
 * 所以现在重新看一下，这种方式就是在创建新的实例之后向新实例里塞东西咯？
 * 2020年9月18日17:47:25
 */

class first{
    private int i;
    public first(int i) {
        this.i =i;
        System.out.println("create first");
    }
    int getI(){
        return i;
    }
}

class secnd{
    first get(){
        return new first(22);
    }

    first get1(){
        return new first(33){
            @Override
            int getI() {        //重写getI
                return 10000;
            }
        };
    }
}

public class exam15 {
    public static void main(String[] args) {
        first first = new first(10);
        secnd secnd = new secnd();

        System.out.println(first.getI());
        System.out.println(secnd.get().getI());
        System.out.println(secnd.get1().getI());
    }
}
