package U6;

public class Lunch {
    private static int i=0;     //静态表创建了几个对象
    private Lunch(){
        i +=1;
        System.out.println("不允许私自创建对象！");
    }
    public static Lunch setup(){
        return new Lunch();
    }
    public int getI(){
        return i;
    }
}
