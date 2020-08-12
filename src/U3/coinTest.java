package U3;

public class coinTest {
    public static void main(String[] args) {
        double i =0;
        int flag1 =0;
        int flag2 =0;

        for(int k =0; k<10000000; k++){
            i = Math.random();
            if(i>=0.5){
                System.out.println("coin为正面");
                flag1++;
            }
            else{
                System.out.println("coin为反面");
                flag2++;
            }
        }
        System.out.println("正面次数为:"+flag1);
        System.out.println("反面次数为:"+flag2);
    }
}
