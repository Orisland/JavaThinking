package U9.animal;

import javax.xml.ws.RequestWrapper;

public class Apply {
    public static void process(animal animal){
        System.out.println("use "+animal.name());
    }

    public static void main(String[] args) {
        //process(new obj());
        process(new animal());
        process(new dog());

    }
}

class obj{      //加extends animal即可
    String name(){
        return "name";
    }
    String sex(){
        return "none";
    }
    Object obj(Object object){
        return object;
    }
}       //尽管这两个对象一模一样，但是就是不能给你用.
/*public class animal {
    String name(){
        return getClass().getSimpleName();
    }
    String sex(){
        return "none";
    }
    animal obj(animal animal){
        return animal;
    }

}*/