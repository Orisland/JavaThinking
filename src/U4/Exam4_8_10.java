package U4;

public class Exam4_8_10 {
    public static void main(String[] args) {

        for (int i=1000; i<10000; i++){

            int[] k = new int[4];
            int[][] l = new int[4][4];
            int[] q = new int[12];
            int count=0;
            int z = i;

            if(z%100 != 0){                     //不允许出现00结尾的数字，出现直接跳过
                for(int j=0; j<4; j++){         //把4位数字拆开
                    k[j] =z%10;
                    z = z/10;
                }

                for (int m=0; m<4; m++){        //把4个数字两两组合并放在一个数组里
                    for (int n=0; n<4; n++){
                        l[m][n] =k[m]*10+k[n];
                    }
                }

                for (int j=0 ;j<4; j++){        //去重，把自己乘自己的部分找出来
                    l[j][j] = 0;
                }

                for (int m=0; m<4; m++){        //然后去掉那部分，形成新数组
                    for (int n=0; n<4; n++){
                        if(l[m][n] != 0){
                            q[count] = l[m][n];
                            count++;
                        }
                    }
                }
                count =66;                      //66的由来是组合C2 12计算得66
                int[] x = new int[count];
                count = 0;
                for (int m=11; m>=0; m--){      //计算拆分两数相乘的结果
                    for (int n=0; n<12; n++){
                        if (m == n){
                            break;
                        }
                        x[count] = q[n]*q[m];
                        count++;
                    }
                }

                for(int m=0; m<count; m++){     //来判断拆分出来的结果再乘回去
                    if(x[m]==i){                //如果乘回去的那么多数字里出现了原拆分数字，则吸血鬼数成立
                        System.out.println("该数字为吸血鬼数:"+x[m]);
                        break;
                    }
                    else {
                        continue;
                    }
                }
            }

            else {                      //这是为了去除吸血鬼数的限制，不能出现00结尾
                continue;
            }

        }

    }
}
