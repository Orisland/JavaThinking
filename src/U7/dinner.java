package U7;

class plate{
    plate(int i){
        System.out.println("plate");
    }
}

class dinnerplate extends plate{
    dinnerplate(int i){
        super(i);
        System.out.println("dinnerplate");
    }
}

class tool{
    tool(int i){
        System.out.println("tool");
    }
}

class spoon extends tool{
    spoon(int i){
        super(i);
        System.out.println("spoon");
    }
}

class fork extends tool{
    fork(int i){
        super(i);
        System.out.println("fork");
    }
}

class knife extends tool{
    knife(int i){
        super(i);
        System.out.println("knife");
    }
}

public class dinner {
    dinner(int i){
        System.out.println("dinner");
        dinnerplate = new dinnerplate(5);
        fork = new fork(5);
        spoon = new spoon(5);
        knife = new knife(5);
    }
    private dinnerplate dinnerplate;
    private fork fork;
    private spoon spoon;
    private knife knife;

    public static void main(String[] args) {
        dinner dinner = new dinner(10);
    }
}
