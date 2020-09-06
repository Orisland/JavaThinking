package U9.process;

public class Apply {
    public static void process(Processor_1 p, Object s){
        System.out.println("Use "+p.name());
        System.out.println(p.process(s));
    }

    public static String s = "montana is toooooooooooooo strong!";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Lowercase(), s);
        process(new Splitter(), s);
    }
}
