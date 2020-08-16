package U9;

interface Playable{
    void play();
}

interface Instrument{
    String adjust();
}

class wind implements Instrument,Playable{
    wind(){

    }
    @Override
    public void play() {
        System.out.println("wind play");
    }

    @Override
    public String adjust() {
        return "adjusting wind";
    }

    @Override
    public String toString() {
        return "wind";
    }
}

class percussion implements Instrument, Playable{
    percussion(){
    }
    @Override
    public void play() {
        System.out.println("percussion play");
    }

    @Override
    public String adjust() {
        return "adjusting percussion";
    }

    @Override
    public String toString() {
        return "percussion";
    }
}

class stringed implements Instrument, Playable{
    stringed(){
    }
    @Override
    public void play() {
        System.out.println("stringed play");
    }

    @Override
    public String adjust() {
        return "adjusting stringed";
    }

    @Override
    public String toString() {
        return "stringed";
    }
}

class woodwind extends wind{
    woodwind(){
    }
    @Override
    public void play() {
        System.out.println("woodwind play");
    }

    @Override
    public String toString() {
        return "woodwind";
    }
}

class brass extends wind{
    brass(){
    }
    @Override
    public void play() {
        System.out.println("brass play");
    }

    @Override
    public String toString() {
        return "brass";
    }
}

public class Music {
    static void tune(Playable p){
        p.play();                       //一旦接口被实现，那么playable就对应了实例
    }
    static void tuneall(Playable[] p){
        for (Playable P1: p){
            tune(P1);
        }
    }
    public static void main(String[] args) {
        Playable[] p={
                new wind(),             //打印wind实现的playable接口
                new percussion(),       //..同上等
                new stringed(),
                new woodwind(),
                new brass()
        };
//        wind wind = new wind();
//        Instrument instrument = new wind();
//        System.out.println(wind.getClass());
//        System.out.println(wind.getClass().getSimpleName());        //向上转型后显示转型后的
//        System.out.println(wind.getClass());                      //class U9.wind   这里会多个class
//        System.out.println(wind.getClass().getName());            //U9.wind         这里只获取了名称没有class前缀了
//        System.out.println(wind.getClass().getSimpleName());      //wind          真·simple，就一个wind了
        tuneall(p);

    }
}
