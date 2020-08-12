package U5;

class bired{
    int i=10;
    String a;

    bired(int i){
        this.i = i;
    }

    bired(String a){
        this.a =a;
    }
}

class Dog{
    String name;
    String bark;
    int a;

    Dog(String name){
        this.name = name;
    }

    void bark(){
        System.out.println("这只狗保持了安静");
    }

    void bark(int a){
        System.out.println("这只狗在叫！");
    }

    void bark(double a){
        System.out.println("这只狗在狂叫!");
    }

    void  bark(char a){
        System.out.println("这只狗马上要变身了！");
    }

    void bark(int i, double a){
        System.out.println("这只狗变身后要进化了！");
    }

    void bark(double a, int i){
        System.out.println("这只狗要先进化然后变身！");
    }
}

public class Exam_5_3_3 {
    public static void main(String[] args) {
        bired niao = new bired(5);
        bired niao1 = new bired("abc");

        System.out.println("鸟的名字为:"+niao1.a);
        System.out.println("鸟的个数为"+niao.i);

        Dog dog = new Dog("dog");
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
        dog.bark('a');
        dog.bark(1,2.5);
        dog.bark(2.5,1);        //这玩意是区分先后顺序的
        }
    }
