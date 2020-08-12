package U4;
//如何检测一个数是不是素数？
public class Exam4_3_4_1 {
    public static void main(String[] args) {
        int i = 4;
        for (int k=1; k<=i; k++){
            System.out.println(k);
            if(i%k == 0){
                if (i==k){
                    System.out.println("是素数");
                }
                else if(k == 1) {
                    continue;
                }
                else {
                    System.out.println("是合数");
                    break;
                }
            }
        }
    }
}
