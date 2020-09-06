package U9.animal1;

public class animal implements Processor {
    @Override
    public String name() {
        return null;
    }

    @Override
    public Object process(Object input) {
        return null;
    }

    public static void main(String[] args) {
        Apply.process(new cat(),"123"); //这样就可以直接用了
    }
}

class cat extends animal{
    @Override
    public String name() {
        return "cat";
    }

    @Override
    public Object process(Object input) {
        return (String)input;
    }
}