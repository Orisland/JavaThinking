package U5;

public class Exam_5_4_9 {

    int treeNum = 0;
    double treeLeave = 0;
    String treeName = "test";

    Exam_5_4_9(int num, String name){   //2
        this("gaiming!!!!");
        treeName = name;
        treeNum = num;
        System.out.println(treeLeave+" "+treeName+" "+treeNum);
        System.out.println("这是第一个构造器");
    }

    Exam_5_4_9(String name){            //3
        treeName = name;
        System.out.println(treeLeave+" "+treeName+" "+treeNum);
        System.out.println("这是第二个构造器");
    }

    Exam_5_4_9(double num){             //1
        this(1,"xyz");
        treeLeave = num;
        System.out.println(treeLeave+" "+treeName+" "+treeNum);
        System.out.println("这是第三个构造器");
    }

    Exam_5_4_9(){

    }

    void out(){
        //this(1,"xyz");
        //这不在上面的构造器里
    }

    public static void main(String[] args) {
        Exam_5_4_9 abc = new Exam_5_4_9(20.2);
        System.out.println("输出完毕！");
    }
}
//this只能写在构造函数的第一行哦~