package U9.animal;

public class animal {
    String name(){
        return getClass().getSimpleName();
    }
    String sex(){
        return "none";
    }
    animal obj(animal animal){
        return animal;
    }

}

class dog extends animal{
    @Override
    String sex() {
        return "man";
    }
}

class cat extends animal{
    @Override
    String sex() {
        return "woman";
    }
}

class bee extends animal{
    @Override
    String sex() {
        return "????";
    }
}