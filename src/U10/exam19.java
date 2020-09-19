package U10;

public class exam19 {
    class inner{
        class inner_1{
            void f(){
                System.out.println("taowa");
            }
        }
        inner_1 get1(){
            return new inner_1();
        }
    }
    inner get2(){
        return new inner();
    }
//==================================
    static class taowa{
        static class taowa1{
            void f1(){};
        }
        taowa1 get1(){
            return new taowa1();
        }
    }
    taowa get3(){
        return new taowa();
    }

    public static void main(String[] args) {
        exam19 exam19 = new exam19();
        exam19.get2();
        exam19.get3();
        new exam19.taowa.taowa1();
        exam19.get2().get1();
        //没生成啥特殊的文件啊……
    }
}
