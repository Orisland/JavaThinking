package U7;

class Poppet{
    private int i;
    Poppet(int i){
        this.i = i;
    }
}

public class blankFinal {
    private static final int i = 0;
    //private static final int j;       static 必须立即初始化，不能等在构造器初始化。
    private final int j;
    private final Poppet POPPET;
    public blankFinal(){
        j = 100;
        POPPET = new Poppet(10);
    }
    public blankFinal(int i){
        j = i;
        POPPET = new Poppet(i);
    }

    public static void main(String[] args) {
        blankFinal blankFinal = new blankFinal();
        System.out.println(blankFinal.j);
        //blankFinal.j = 10;            //一旦构造无法修改
        blankFinal blankFinal1 = new blankFinal(100321);
        System.out.println(blankFinal1.j);
    }
}
