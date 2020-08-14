package U8;

import java.util.Random;

class Instrument{
    void play(){
        System.out.println("instrument play");
    }
    public String toString(){return "instrument";}


    void adjust(){
        System.out.println("adjusting instrument");
    }
}

class Wind extends Instrument{
    @Override
    void play() {
        System.out.println("wind play");
    }

    @Override
    public String toString() {
        return "wind";
    }

    @Override
    void adjust() {
        System.out.println("adjust wind");
    }
}

class Percussion extends Instrument{
    @Override
    void play() {
        System.out.println("play percussion");
    }

    @Override
    public String toString() {
        return "percussion";
    }

    @Override
    void adjust() {
        System.out.println("adjust percussion");
    }
}

class Stringed extends Instrument{
    @Override
    void play() {
        System.out.println("play stringed");
    }

    @Override
    public String toString() {
        return "stringed";
    }

    @Override
    void adjust() {
        System.out.println("adjust stringed");
    }
}

class Woodwind extends Wind{
    @Override
    void play() {
        System.out.println("play woodwind");
    }

    @Override
    public String toString() {
        return "woodwind";
    }

    @Override
    void adjust() {
        System.out.println("adjust woodwind");
    }
}

class Brass extends Wind{
    @Override
    void play() {
        System.out.println("play brass");
    }

    @Override
    public String toString() {
        return "brass";
    }

    @Override
    void adjust() {
        System.out.println("adjust brass");
    }
}

class musicrandom{
    private Random random = new Random();
    public Instrument next(){
            switch (random.nextInt(5)){
                default:            //这个必须有
                case 0:
                    return new Wind();      //因为每个都有return，所以不要break，没有return别忘了
                //break;
                case 1:
                    return new Percussion();
                case 2:
                    return new Stringed();
                case 3:
                    return new Woodwind();
                case 4:
                    return new Brass();
        }
    }
}

public class Music {
    private int i;
    private Instrument[] instruments;
    public Music(int i){
        this.i = i;
        musicrandom musicrandom = new musicrandom();
        instruments = new Instrument[i];
        for (int j=0; j<instruments.length; j++){           //填充数组
            instruments[j] = musicrandom.next();
        }
    }

    public void put(){
        for (Instrument instrument: instruments){
            instrument.play();
        }
    }

    public void put1(){
        for (Instrument instrument: instruments){
            System.out.println(instrument);
            //其实这个输出的就是toString
        }
    }

    public static void main(String[] args) {
        Music music =new Music(5);                           //主函数直接创建就完事了
        Instrument instrument = new Instrument();               // 懒人是这样的
        music.put1();
        //music.put();
    }

}
