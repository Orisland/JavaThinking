package U9.animal1;

import U9.animal.animal.*;

//适配器

public class shipeiqi {
    public static void main(String[] args) {
        Apply.process(new shipeiqi1(new animal()),"cat");   //产生我需要的接口
    }
}

class shipeiqi1 implements Processor{
    animal animal;
    shipeiqi1(animal animal){
        this.animal = animal;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public Object process(Object input) {
        return null;
    }
}