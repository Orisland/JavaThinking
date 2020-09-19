package U10;

/**
 * 使用匿名类后的工厂模式？
 * 2020年9月18日17:59:03
 */

interface Service{
    void f();
    void g();
}

interface ServiceFactor{
    Service getservice();
}

class factor1 implements Service{
    @Override
    public void f() {
        System.out.println("factor1 f()");
    }

    @Override
    public void g() {
        System.out.println("factor1 g()");
    }

    ServiceFactor serviceFactor = new ServiceFactor() {
        @Override
        public Service getservice() {
            return new factor1();
        }
    };
}

class factor2 implements Service{
    @Override
    public void f() {
        System.out.println("factor2 f()");
    }

    @Override
    public void g() {
        System.out.println("factor2 g()");
    }

    ServiceFactor serviceFactor =new ServiceFactor() {      //相当于简化了
        @Override
        public Service getservice() {
            return new factor2();
        }
    };
}

public class Factor {
    void catchserver(ServiceFactor serviceFactor){
        Service service = serviceFactor.getservice();
        service.f();
        service.g();
    }
    public static void main(String[] args) {
        Factor factor = new Factor();
        factor.catchserver(new factor1().serviceFactor);
        factor.catchserver(new factor2().serviceFactor);
    }
}
