package U9;

interface fastfood{
    void eat();
    void meun();
    void heat();
    void time();
    void cost();
}

enum caidan{
    sandwich, hanbao, shutiao, mianbao
}

class sandwich implements fastfood{
    sandwich(){
        time();
        heat();
        eat();
        cost();
    }
    @Override
    public void eat() {
        System.out.println("吃三明治");
    }

    @Override
    public void meun() {
        System.out.println("null");
    }

    @Override
    public void heat() {
        System.out.println("三明治热量较高");
    }

    @Override
    public void time() {
        System.out.println("三明治需要10分钟");
    }

    @Override
    public void cost() {
        System.out.println("一个三明治10块钱哦");
    }
}

class menu implements fastfood{
    @Override
    public void eat() {
        System.out.println("null");
    }

    @Override
    public void meun() {
        System.out.println("本店有各种美食哦~");
        System.out.println(caidan.hanbao);
        System.out.println(caidan.mianbao);
        System.out.println(caidan.sandwich);
        System.out.println(caidan.shutiao);
    }

    @Override
    public void heat() {
        System.out.println("null");
    }

    @Override
    public void time() {
        System.out.println("null");
    }

    @Override
    public void cost() {
        System.out.println("free");
    }
}

public class restaurant {
    public static void main(String[] args) {
        menu menu =new menu();
        menu.meun();
        sandwich sandwich = new sandwich();
    }
}
