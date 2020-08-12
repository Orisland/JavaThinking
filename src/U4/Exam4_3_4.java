package U4;
//计算100以内所有的素数，mmp有毒吧，这破东西我凑了半天才凑出来……，音乐会影响我写代码的效率吗？
public class Exam4_3_4 {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++){
            for (int k=1; k<=i; k++){
                if(i%k == 0){
                    if (i==k){
                        System.out.println(i);
                        break;
                    }
                    else if(k == 1) {
                        continue;
                    }
                    else {
                        break;
                    }
                }
            }
        }
    }
}
