package U7;

class test{
    public int i;
    public int res = 0;
    test(int i){
        this.i = i;
    }
    int f(){
        System.out.println(i);
        for(int j = 0; j<i; j++){
            res += j;
        }
        System.out.println(res);
        return res;
    }

    int g(){
        return res/i;
    }
}

public class SumTest extends test {
    private int i;
    private int res =0;

    public SumTest(int i){
        super(i);
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int g(){
        return super.f();
    }

    public int f(){
        System.out.println("SUPER"+super.f());

        for(int j = 0; j<i; j++){
            res += j;
        }
        return res/2;
    }

    public static void main(String[] args) {
        SumTest sumTest =new SumTest(10);
        System.out.println("F()"+sumTest.f());
        System.out.println("G()"+sumTest.g());      //两次运行导致运行了两次，导致使用了两次f()所以导致出现90
    }                                               //所以也就是说super中初始化的数据并不会清空，而是初始一次一直用
}                                                   //所以一直用一个实体就会出现这个问题
