package U10;

/**
 * 我跟你说这个例子我看着有点之前的感觉
 * 2020年9月14日16:44:07
 * 修改
 * 2020年9月14日17:35:56
 */

interface Selector{
    boolean end();
    Object current();
    void next();
    Sequence back();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if (next < items.length){
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector{
        @Override
        public Sequence back() {
            return Sequence.this;       //生成sequence方法的引用
        }

        private int i = 0;
        @Override
        public boolean end() {          //告诉你数组到尾巴了没
            return i == items.length;
        }

        @Override
        public Object current() {       //把当前的数组数据拿出来
            return items[i];
        }

        @Override
        public void next() {            //如果没到头则继续向后翻一个
            if (i<items.length){
                i++;
            }
        }
    }

    public boolean check(){
        return this == ((SequenceSelector)selector()).back();       //true
    }

    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i=0; i<10; i++){
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }
        System.out.println(sequence.check());
    }

}

class xinlei{
    private String str;

    public xinlei(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "xinlei{" +
                "str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        xinlei xinlei = new xinlei("exam2");
        Sequence sequence = new Sequence(10);
        for (int i=0; i<5; i++){
            sequence.add(xinlei.str.toCharArray()[i]);
        }
        sequence.add(xinlei.toString());
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}