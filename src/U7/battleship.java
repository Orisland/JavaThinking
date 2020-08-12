package U7;
//代理测试
class engine{
    public void up(int speed){
        System.out.println("up!"+speed);
    }
    public void down(int speed){
        System.out.println("down!"+speed);
    }
    public void left(int rad){
        System.out.println("left!"+rad);
    }
    public void right(int rad){
        System.out.println("right!"+rad);
    }
    public void boots(){
        System.out.println("engine boost!");
    }
}

public class battleship {
    private String name;
    public battleship(String name){
        this.name = name;
    }
    private engine engine =new engine();        //Delegated methods,Idea自动填充

    public void up(int speed) {
        engine.up(speed);
    }

    public void down(int speed) {
        engine.down(speed);
    }

    public void left(int rad) {
        engine.left(rad);
    }

    public void right(int rad) {
        engine.right(rad);
    }

    public void boots() {
        engine.boots();
    }

    public static void main(String[] args) {
        battleship battleship = new battleship("montana");
        battleship.up(1000);
    }
}
