package U7;
//向上转型
class Instruments{
    public void play(){
        System.out.println("乐器演奏");
    }
    static void tune(Instruments instruments){
        instruments.play();
    }
}

public class Wind extends Instruments {
    public static void main(String[] args) {
        Wind wind = new Wind();        //注意这里wind为wind类型
        Instruments.tune(wind);         //但是这里转化为了Instuments类型
    }
}
//所以应该想想到底什么时候需要向上转型，毕竟向上转型需要继承。