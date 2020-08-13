package U8;

class Cycle{
    public void ride(Cycle cycle){
        System.out.println("cycle ride!");
    }
}

class Unicycle extends Cycle{
    public void ride(Unicycle unicycle){
        System.out.println("Unicycle ride");
    }
}

class Bicycle extends Cycle{
    public void ride(Bicycle bicycle){
        System.out.println("Bicycle ride");
    }
}

class Tricycle extends Cycle{
    public void ride(Tricycle tricycle){
        System.out.println("tricycle ride");
    }
}

public class CycleTest {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();     //这是靠具体的方法向上转型
        unicycle.ride(new Cycle());
        bicycle.ride(new Cycle());
        tricycle.ride(new Cycle());
    }
}
