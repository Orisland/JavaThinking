package U9.animal1;

public class Apply {
    public static void process(Processor p, Object obj){
        System.out.println("use "+p.name());
        System.out.println(p.process(obj));
    }
}
