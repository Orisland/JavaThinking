package U8;

import java.util.Random;

class Rodent{
    Rodent(){
        System.out.println("rodent constructor");
    }
    public void voice(){
        System.out.println("voice");
    }
    public void move(){
        System.out.println("move");
    }

    @Override
    public String toString() {
        return "Rodent";
    }

    public void what(){
        System.out.println("????");
    }
}

class Mouse extends Rodent{
    Mouse(){
        System.out.println("mouse constructor");
    }
    @Override
    public void voice() {
        System.out.println("mouse voice");
    }

    @Override
    public void move() {
        System.out.println("mouse move");
    }

    @Override
    public String toString() {
        return "mouse";
    }
}

class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("gerbil constructor");
    }
    @Override
    public void voice() {
        System.out.println("Gerbil voice");
    }

    @Override
    public void move() {
        System.out.println("Gerbil move");
    }

    @Override
    public String toString() {
    return "Gerbil";
    }
}

class Hamster extends Rodent{
    Hamster(){
        System.out.println("hamster constructor");
    }
    @Override
    public void voice() {
        System.out.println("hamster voice");
    }

    @Override
    public void move() {
        System.out.println("hamster move");
    }

    @Override
    public String toString() {
    return "hamster";
    }
}


public class Rodents {
    public Rodents(){
        Random random = new Random();
        Rodent[] rodents = new Rodent[3];

        for (int i=0; i<rodents.length; i++){
            switch (random.nextInt(3)){
                case 0:
                    System.out.println(new Mouse());
                    break;
                case 1:
                    System.out.println(new Gerbil());
                    break;
                case 2:
                    System.out.println(new Hamster());
                    new Hamster().what();       //不被覆盖就是原方法咯？
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Rodents rodents = new Rodents();
        Rodent rodent = new Rodent();
        rodent.voice();
    }

}
