package U6;

import static tool.arr.*;
import static tool.print.*;

public class importTest {
    public static void main(String[] args) {
        int[]a = {1, 10, 55, 20, 10, 3};
        sum sum = new sum(6, 5);
        arrout(sort(a));
        printlb(sum(a));
    }
}
