package U7;

class Frog{
    private String city;
    Frog(String city){
        this.city = city;
    }
    public void nengjiandu(){
        System.out.println("极低");
    }
    public void location(String city){
        System.out.println(city);
    }
    public void keli(){
        System.out.println("pm2.5 overload");
    }
    public static void clean(Frog Frog){
        System.out.println("clean?");
    }
}

public class Amphibian extends Frog {
    public Amphibian(String city){
        super(city);
    }

    public void sound(){
        System.out.println("子类特有方法");
    }

    public void keli(){
        System.out.println("pm2.5 is low!");
    }

    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian("beijing");
        amphibian.keli();
        amphibian.location("beijing");
        Frog frog = new Amphibian("shanghai");              //向上转型
        frog.nengjiandu();              //只能用之前的东西了
        //frog.sound();子类特有方法无法使用
        Frog.clean(amphibian);
    }
}
