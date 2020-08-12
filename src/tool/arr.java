package tool;

public class arr {
    public static int[] sort(int arr[]){    //冒泡
        int len = arr.length;
        int t;
        for(int i=0; i<len-1; i++){
            for (int j=len-1; j>i; j--){
                if (arr[i] > arr[j]){
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        return arr;
    }

    public static double[] sort(double arr[]){
        int len = arr.length;
        double t;
        for(int i=0; i<len-1; i++){
            for (int j=len-1; j>i; j--){
                if (arr[i] > arr[j]){
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        return arr;
    }

    public static int sum(int[] arr){   //求和
        int num = 0;
        for (int i : arr){
            num +=i;
        }

        return num;
    }

    public static int sum(double[] arr){
        int num = 0;
        for (double i : arr){
            num +=i;
        }

        return num;
    }

    public static void arrout(int[] arr){   //输出
        System.out.println("数组输出结果:");
        for (int i: arr){
            System.out.println(i);
        }
    }

    public static void arrout(double[] arr){
        System.out.println("数组输出结果:");
        for (double i: arr){
            System.out.println(i);
        }
    }
}
