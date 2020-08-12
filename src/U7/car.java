package U7;
//is-a 继承，has-a组合
class wheel{
    wheel(int i){
        System.out.println(i+"wheel");
    }
}

class door{
    door(int i){
        System.out.println(i+"door");
    }
}

class carengine{
    public void start(){}
    public void stop(){}
    public void left(){}
    public void right(){}
}

public class car {
    private wheel wheel;
    private door door;
    private carengine carengine;
    public car(){
        wheel = new wheel(5);
        door = new door(5);
        carengine = new carengine();
    }

    public static void main(String[] args) {
        car car = new car();
    }
}
