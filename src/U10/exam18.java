package U10;

/**
 * 嵌套类
 * 2020年9月18日18:58:51
 */

class qiantao{
    static class inner{
        void f(){
            System.out.println("qiantao inner");
        }
    }

    public static void main(String[] args) {
        inner inner = new inner();
        inner.f();
    }
}

public class exam18 {
    void f(){
        qiantao.inner inner = new qiantao.inner();      //需要前缀
        inner.f();
    }
}
