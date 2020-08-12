package U4;

public class Exam_4_8_10_1 {
    public static void main(String[] args) {
        int i =2187;
        int z = i;
        int[] k = new int[4];
        int[][] l = new int[4][4];
        int[] q = new int[12];
        int count=0;

        System.out.println("输入数字:"+i);

        for(int j=0; j<4; j++){
            k[j] =i%10;
            i = i/10;
        }

        for (int j=0; j<4; j++){
            System.out.println("拆分数字:"+k[j]);
        }

        for (int m=0; m<4; m++){
            for (int n=0; n<4; n++){
                l[m][n] =k[m]*10+k[n];
            }
        }

        for (int j=0 ;j<4; j++){
            l[j][j] = 0;
        }

        for (int m=0; m<4; m++){
            for (int n=0; n<4; n++){
                if(l[m][n] != 0){
                    q[count] = l[m][n];
                    count++;
                }
            }
        }
        count =66;
        int[] x = new int[count];
        count = 0;
        for (int m=11; m>=0; m--){
            for (int n=0; n<12; n++){
                if (m == n){
                    break;
                }
                x[count] = q[n]*q[m];
                count++;
            }
        }
        System.out.println("总数:"+count);

        for(int m=0; m<count; m++){
            if(x[m]==z){
                System.out.println("该数字为吸血鬼数");
                break;
            }
            else {
                continue;
            }
        }
    }
}
