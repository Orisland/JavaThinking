package U10;

/**
 * 我似乎对向上转型有了一些更多的理解和体会
 * 2020年9月16日15:53:48
 */

public class exam10 {
    public jiekou output(int i){
        if (i ==1){
            class inner implements jiekou{
                @Override
                public void f() {
                    System.out.println("这个类在方法里");
                }
            }
            return new inner();
        }else {
            System.out.println("null");
            return null;
        }
//        return new inner();
        //这个是写不出来的
    }

    public static void main(String[] args) {
        new exam10().output(1).f();
        new exam10().output(0).f();     //虽然你可以调用f(),但是该方法存在的前提是该类被正确创建。
    }
}
