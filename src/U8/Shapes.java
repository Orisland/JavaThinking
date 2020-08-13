package U8;

import java.util.Random;

class shape{
    public void draw(){}
    public void clean(){}
    public void put(){
        System.out.println("this is a shape!");
    }
}

class Circle extends shape{
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void clean() {
        System.out.println("Circle clean");
    }
}

class Square extends shape{
    @Override
    public void draw() {
        System.out.println("square draw");
    }

    @Override
    public void clean() {
        System.out.println("square clean");
    }
}

class Triangle extends shape{
    @Override
    public void draw() {
        System.out.println("triangle draw");
    }

    @Override
    public void clean() {
        System.out.println("triangle clean");
    }
}

class RandomShape{
    private Random random = new Random(46);
    public shape next(){
        switch (random.nextInt(3)){
            default:
            case 0:return new Circle();
            case 1:return new Triangle();
            case 2:return new Square();
        }
    }
}

public class Shapes {
    private static RandomShape randomShape = new RandomShape();
    public static void main(String[] args) {
        shape[] shapes = new shape[6];
        for (int i=0; i<shapes.length; i++){
            shapes[i] = randomShape.next();
        }
        for (shape s:shapes){
            s.draw();
        }
    }
}
