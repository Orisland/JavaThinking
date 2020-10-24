package U10;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 这个例子是用来测试内部类结合控制框架的
 * 书上拆成了很多分，这里合在一起吧
 * 2020年10月2日14:54:46
 * 目前该程序一旦启动就会无限运行？
 * 2020年10月2日18:55:23
 */

abstract class event{               //到目前为止，我依然不知道这个event是用来做什么的
    private long eventtime;
    protected final long dalaytime;
    public event(long dalaytime){   //构造器
        this.dalaytime = dalaytime;
        start();                    //构造对象即开始
    }

    /**
     * nonotime返回纳秒
     */

    public void start(){
        eventtime = System.nanoTime() + dalaytime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventtime;
    }

    public abstract void action();
}

public class control {
    private List<event> eventList = new ArrayList<event>();
    public void addevent(event c){eventList.add(c);}
    public void run(){
        while (eventList.size() > 0){
            for (event e: new ArrayList<event>(eventList)){
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}

class house extends control{
    private boolean light = false;
    public class lighton extends event{
        @Override
        public void action() {
            light = true;
        }

        public lighton(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "light on";
        }
    }

    public class lightoff extends event{
        @Override
        public void action() {
            light = false;
        }

        public lightoff(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "light off";
        }
    }
    private boolean water = false;
    public class wateron extends event{
        @Override
        public void action() {
            water = true;
        }

        public wateron(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "water on";
        }
    }

    public class wateroff extends event{
        @Override
        public void action() {
            water = false;
        }

        public wateroff(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "water off";
        }
    }

    private String jiashi = "day";
    public class jsDay extends event{
        @Override
        public void action() {
            jiashi = "DAY";
        }

        public jsDay(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "jiashi day";
        }
    }

    public class jsnight extends event{
        @Override
        public void action() {
            jiashi = "night";
        }

        public jsnight(long dalaytime) {
            super(dalaytime);
        }
    }

    private boolean fan = false;
    public class fanon extends event{
        @Override
        public void action() {
            fan = true;
        }

        public fanon(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "fan on";
        }
    }

    public class fanoff extends event{
        @Override
        public void action() {
            fan = false;
        }

        public fanoff(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "fan off";
        }
    }

    public class bell extends event{
        @Override
        public void action() {
            addevent(new bell(dalaytime));
        }

        public bell(long dalaytime) {
            super(dalaytime);
        }

        @Override
        public String toString() {
            return "D U A N G!";
        }
    }
    //restart没看懂
    public class restart extends event{
        private event[] events;
        public restart(long dalaytime, event[] events) {
            super(dalaytime);
            this.events = events;
            for (event e: events){
                addevent(e);
            }
        }

        @Override
        public void action() {
            for (event e: events){
                e.start();
                addevent(e);
            }
            start();
            addevent(this);
        }

        @Override
        public String toString() {
            return "restart";
        }
    }

    public static class stop extends event{
        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "stop server";
        }

        public stop(long dalaytime) {
            super(dalaytime);
        }
    }
}

class housecontrol{
    public static void main(String[] args) {
        house house = new house();
        house.addevent(house.new bell(900));
        event[] events = {
                house.new jsDay(0),
                house.new lighton(200),
                house.new lightoff(400),
                house.new wateron(600),
                house.new wateroff(800),
                house.new fanon(1000),
                house.new fanoff(1200),
        };

        house.addevent(house.new restart(200,events));
        if (args.length ==1){
            house.addevent(
                    new house.stop(new Integer(args[0])));
        }
        house.run();
    }
}