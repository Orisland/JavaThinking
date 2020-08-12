package U7;



class destroy {
    private double sigma = 0.8;
    private int heal = 10000;
    private String flag = "red";
    public int guns = 10;

    public destroy(){
        System.out.println("创建船只");
    }
    public void getsgm(){
        System.out.println(sigma);
    }
    public void append(){
        System.out.println("append()");
    }
    public void shoot(){
        System.out.println("boat had fired!");
    }
    public void hurd(){
        System.out.println("we are hit!!");
    }
    public int getheal(){
        return heal;
    }
    public String getFlag(){
        return flag;
    }

    @Override
    public String toString() {
        return "boat{" +
                "sigma=" + sigma +
                '}';
    }

    public static void main(String[] args) {

    }
}

public class ExtendTest extends destroy {
    public void append(){
        super.append();
        System.out.println(super.guns);
    }

    public static void main(String[] args) {
        ExtendTest extendTest = new ExtendTest();
        extendTest.append();
    }
}
