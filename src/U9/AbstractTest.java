package U9;

abstract class test{
    public test(){
        print();
    }
    public abstract void print();
}

class daochu extends test{
    private int i = 10;
    @Override
    public void print() {
        System.out.println(i);
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        daochu daochu =new daochu();
        daochu.print();
    }
}
//首先是0然后是正常的10，第一个0是因为没有初始化，我记得昨天刚弄过这个测试，这怎么又来了一次
