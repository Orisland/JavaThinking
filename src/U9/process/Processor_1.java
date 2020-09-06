package U9.process;

import java.util.Arrays;

public class Processor_1 {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){return input;}
}

class Upcase extends Processor_1{
    Object process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Lowercase extends Processor_1{
    Object process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor_1{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}