package U8;

class Shared{
    private int refcount =0;            //引用计数
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("create "+this);
    }
    public void add(){                  //引用加一
        refcount++;
    }
    public void dispose(){
        if (--refcount ==0){            //有点搞不明白为什么要这么写
            System.out.println("disposing "+ this);
        }
    }

    public void finalize(){             //垃圾回收，这个东西不推荐使用
        if (refcount != 0){
            System.out.println("clean is not properly");
        }
        else {
            System.out.println("clean is ok");
        }
    }
    @Override
    public String toString() {
        return "Share "+ id;
    }
}

class Composing{
    private Shared shared;
    private static long couter =0;
    private final long id = couter++;
    public Composing(Shared shared){
        System.out.println("create "+ this);
        this.shared = shared;
        this.shared.add();
    }
    public void dispose(){
        System.out.println("disposing "+ this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "composing "+ id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {
            new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)
        };
        for (Composing c:composings){
            c.dispose();
        }
        new Composing(new Shared());    //确保清理不完全
        System.gc();                    //垃圾回收，但是没事别乱用，这个东西可不好玩
    }                                   //可是为啥要清理呢？java本来不是带清理吗，还要这么搞？
}
