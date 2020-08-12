package U6;

public class LunchTest {
    public static void main(String[] args) {
        Lunch lunch = Lunch.setup();
        System.out.println(lunch.getI());
        Lunch lunch1 = Lunch.setup();
        Lunch lunch2 = Lunch.setup();
        Lunch lunch3 = Lunch.setup();
        Lunch lunch4 = Lunch.setup();
        System.out.println(lunch4.getI());
    }
}
