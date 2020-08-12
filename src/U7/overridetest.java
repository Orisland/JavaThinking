package U7;

class animal{
    char choot(char c){
        System.out.println("choot c");
        return 'd';
    }

    int choot(int c){
        System.out.println("choot i");
        return 10;
    }

    float choot(float c){
        System.out.println("choot f");
        return 10.5F;
    }
}

class leg{}

class cat extends animal{
    void choot(leg leg){
        System.out.println("leg");
    }

}

public class overridetest {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.choot(new leg());
        cat.choot(2);
        cat.choot('x');
        cat.choot(5.5F);
    }
}
