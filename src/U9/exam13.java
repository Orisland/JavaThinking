package U9;

interface basic{
    void base();
}

interface auto extends basic{
    @Override
    void base();
}

interface auto1 extends basic{
    @Override
    void base();
}

interface newin extends auto1, auto{
    @Override
    void base();
}

class New implements newin{
    @Override
    public void base() {
        System.out.println("get "+getClass().getSimpleName());
    }
}

public class exam13 {
    public static void main(String[] args) {
        New n = new New();
        n.base();
    }
}
