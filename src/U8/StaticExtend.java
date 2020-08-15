package U8;

class staticsuper{
    public int test = 0;
    public static String set(){
        return "staticsuper";
    }

    public static String get(){
        return "superget";
    }
    public int output(){
        return test;
    }
}

class staticsuper1 extends staticsuper{
    public int test = 1;
    public static String set(){
        return "super1";
    }

    public static String get(){             //static方法不吃多态
        return "super1get";
    }

    @Override
    public int output() {
        return test;
    }
    public int getsuperoutput(){
        return super.test;
    }
}

public class StaticExtend {
    public static void main(String[] args) {
        staticsuper staticsuper = new staticsuper1();
        System.out.println(staticsuper.test);               //这是显示父类的
        System.out.println(staticsuper.output());           //这是显示子类的
        System.out.println("=================");
        staticsuper1 staticsuper1 = new staticsuper1();
        System.out.println(staticsuper1.test);
        System.out.println(staticsuper1.getsuperoutput());
    }
}
