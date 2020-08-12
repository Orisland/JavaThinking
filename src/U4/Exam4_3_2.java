package U4;

import java.util.Random;
//一开始着实没想到后面可以这么处理
public class Exam4_3_2 {
    public static void main(String[] args) {
        int a,b = 0;
        Random k = new Random();

        for (int i = 0; i<25; i++){
            a = k.nextInt(25);

            System.out.println("a="+a);
            System.out.println("b="+b);

            if(i==0){
                System.out.println("此数字为第一位不作对比");
            }
            else if(a>b){
                System.out.println("a>b");
            }
            else if (a==b){
                System.out.println("a=b");
            }
            else {
                System.out.println("a<b");
            }
            b=a;        //其实这步才是精髓
        }
    }
}
