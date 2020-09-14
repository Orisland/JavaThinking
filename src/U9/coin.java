package U9;

import java.util.Random;

/**
 * exam19 工厂模式丢色子,和硬币
 * 这是最后一个练习了==
 * 但是我依然处于懵逼状态
 * 只能说好像稍微有点眉目？
 * 这个时间点本来我应该去火车站了来着==
 * 2020年9月10日11:12:14
 */

interface action{
    void start();
}


interface actionfactory{
    action getaction();
}

class putcoin implements action{
    Random random = new Random();
    @Override
    public void start() {
        System.out.println("丢硬币！"+random.nextInt(2));
    }
}

class putcoinfactory implements actionfactory{
    @Override
    public putcoin getaction() {        //putcion 可以替换为action，只要后缀对就行
        return new putcoin();
    }
}

class puttouzi implements action{
    Random random = new Random();
    @Override
    public void start() {
        System.out.println("投色子！"+random.nextInt(7));
    }
}

class puttouzifactory implements actionfactory{
    @Override
    public action getaction() {
        return new puttouzi();
    }
}

public class coin {
    static void out(actionfactory actionfactory){
        action action = actionfactory.getaction();
        action.start();
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            out(new putcoinfactory());
            out(new puttouzifactory());
        }
    }
}
