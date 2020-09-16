package U10;

/**
 * u1s1我觉得这个内部类之前一直在用啊，为啥还要重新学一遍啊……搞不懂搞不懂
 * 2020年9月14日16:43:12
 * 修改
 * 2020年9月14日17:36:04
 */
public class Outer {
    private final String str;

    public Outer(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }


    class Inner{
        private int i;
        public Inner(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return str;
        }
    }

    public Inner reback(){
        return new Inner(10);
    }

    public static void main(String[] args) {
        Outer outer = new Outer("exam1");
        Outer.Inner inner = outer.reback();
        System.out.println(inner.getI());
        System.out.println(inner.toString());
    }

    //inner访问outer!
}
