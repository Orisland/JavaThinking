package U10;

/**
 * 吃我的无限套娃大法啊！
 * 2020年9月18日20:04:54
 */

class taowa1{
    class taowa2{
        class taowa3{
            class taowa4{
                class taowa5{
                    void f(){
                        System.out.println("taowa5");
                    };
                }
            }
        }
    }
}

public class supertw {
    public static void main(String[] args) {
        taowa1.taowa2.taowa3.taowa4.taowa5 tw = new taowa1().new taowa2().new taowa3().new taowa4().new taowa5();
        tw.f();         //套，就硬套
    }
}
