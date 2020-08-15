package U8;

class pen{
    public void draw(){
        System.out.println("pen draw");
    }

    public pen(){
        System.out.println("===初始化pen开始===");
        System.out.println("before");
        draw();                             //被override为pencil draw
        System.out.println("after");
        System.out.println("===初始化pen结束===");
    }
}

class pencil extends pen{
    private int piece = 1;
    @Override
    public void draw() {
        System.out.println("pencil draw");
        System.out.println(piece);          //但是很遗憾piece并未被初始化，所以也就是0，父类中不包含piece
    }
    public pencil(){
        System.out.println("===初始化pencil开始===");
        System.out.println(piece);          //初始化之后才有正常的1显示否则是没有的哦
        System.out.println("pencil");
    }
}

public class Painting {
    public static void main(String[] args) {
        System.out.println("==========");
        pencil pencil = new pencil();
        System.out.println("==========");   //添加分割线表示输出组成部分
        pencil.draw();                      //这个pencil在new之后，piece才被初始化，才有正确的1
    }
}
//所以嘛，尽量不要在初始化的时候往里面塞方法，容易出现这种问题
//构造器尽可能简单的让的方法让对象进入正常状态，如果可以的话就是别加方法了。
//唯一安全的是final方法，或者private方法，毕竟这俩不可被继承