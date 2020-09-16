package U10;

/**
 * 外部类中的.this
 * 2020年9月14日19:51:01
 */

public class dotthis {
    void f(){
        System.out.println("dot this!");
    }

    void h(){
        System.out.println("dot this h");
    }

    inner catchinner(){
        return new inner();
    }

    class inner{
        public dotthis g(){
            return dotthis.this;    //.this后可以就是外层的里的方法了
        }
    }

    public static void main(String[] args) {
        dotthis dt = new dotthis();
        dotthis.inner dt1 = dt.catchinner();
        dt1.g().f();
        dt1.g().h();
    }
}
