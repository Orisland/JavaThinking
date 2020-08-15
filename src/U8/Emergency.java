package U8;
//extends -> is-a (X) is-like-a一旦向上转型这些更useful的东西就没了，就很吃屎
class ship{
    public void action(){
    }
}

class Starship extends ship{
    @Override
    public void action() {
        System.out.println("这是一艘飞船");
    }

    public void enm(){
        System.out.println("飞船着了啊啊啊啊啊");
    }

}

class alartStatus{
    public void loud(){
        System.out.println("warm!");
    }
}

class alartRed extends alartStatus{
    @Override
    public void loud() {
        System.out.println("red warm!");
    }
}

class alartGreen extends alartStatus{
    @Override
    public void loud() {
        System.out.println("Green safe!");
    }
    public void ouput(){
        System.out.println("output");
    }
}

class space{
    public Starship starship = new Starship();
    private alartStatus alartStatus = new alartStatus();
    public alartStatus green(){
        alartStatus = new alartGreen(); //向上转型，xxx里包含yyy，所以xxx可以new新的yyy
        return alartStatus;
    }
    public alartStatus red(){
        alartStatus = new alartRed();   //向上转型
        return alartStatus;
    }
}

public class Emergency {
    public static void main(String[] args) {
        space space = new space();
        space.starship.action();
        space.green().loud();
        //space.green().ouput();
        //space.green().output();       //向上转型后，丢失更userful的特殊方法
        space.starship.enm();
        space.red().loud();
    }
}
//草，这写的什么沙雕东西