package U9;

interface canfight{
    void fight();
}

interface canfly{
    void fly();
}

interface canswim{
    void swim();
}

interface canclimb{
    void climb();
}

class Actionfight{
    public void fight(){}
}

class hero extends Actionfight implements canfight,canfly,canswim,canclimb{       //可以不提供fight()
    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}

public class Adventure {
    public static void fight(canfight x){x.fight();}
    public static void swim(canswim x){x.swim();}
    public static void fly(canfly x){x.fly();}
    public static void act(Actionfight x){x.fight();}
    public static void climb(canclimb x){x.climb();}

    public static void main(String[] args) {
        hero hero = new hero();
        fight(hero);
        swim(hero);
        fly(hero);
        act(hero);
        climb(hero);

    }
}
