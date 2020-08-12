package U7;
//禁止继承，final
final class doNotExtend{
    private String property1;
    private String property2;
    private String property3;
    doNotExtend(){
        System.out.println("该类禁止继承");
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public String getProperty3() {
        return property3;
    }

    public void setProperty3(String property3) {
        this.property3 = property3;
    }
}

//class tryextends extends doNotExtend{     //finnal 禁止继承,个人感觉和private一个作用。
//    public tryextends() {
//    }
//}

public class FinalClass {
    public static void main(String[] args) {
        doNotExtend doNotExtend = new doNotExtend();
        doNotExtend.setProperty1("test");
        System.out.println(doNotExtend.getProperty1());
    }
}
