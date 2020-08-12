package U7;
//final and static

import java.util.Random;

class block{
    public final int SHOOT = 0;
    public static int ATTACK = 1;
    public static final int SIZE = 10;
    public static final int MAX = 64;
    public static final String BLOCK_NAME = "DIRT";
    public static final double RANDOM = Math.random();
    public static double RANDOM1 = Math.random();;

}

public class Minecraft {
    public static void main(String[] args) {
        System.out.println(block.BLOCK_NAME);
        System.out.println(block.ATTACK);
        System.out.println(block.SIZE);
        //System.out.println(block.SHOOT);      //没有 static不能这么用得初始化
        block block = new block();
        System.out.println(block.SHOOT);        //shoot需要这么才能使用
        System.out.println(block.RANDOM);       //只初始化一次
        System.out.println(block.RANDOM);
        System.out.println(block.RANDOM);
        System.out.println(block.RANDOM1);      //只初始化一次哦
        System.out.println(block.RANDOM1);
        System.out.println(block.RANDOM1);
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(new Random().nextInt(100));      //random里可以填入一个seed，这个seed类似于序号
        System.out.println(new Random().nextInt(100));      //一旦确定序号之后，那么生成的就是同一个随机数
        System.out.println(new Random().nextInt(100));      //加了seed，如果还是一样的，那么这三个数字将会一样
    }
}
