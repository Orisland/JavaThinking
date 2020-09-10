package U9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

//为了让scanner类的输入不拘泥，所以特地加了个Readable接口，只要实现此接口的run方法即可做到被scanner调用。
class charxu{
    Random random = new Random();
    private char[] out;
    private String out1 = "";

    private char[] c1 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public String pack(){
        for (int i=0; i<26; i++){
            out1 += c1[random.nextInt(26)];
        }
        out = out1.toCharArray();

        return out1;
    }
}

class adapted extends charxu implements Readable{
    private int count;
    adapted(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {     //如果read返回小于0则没有可以读取的东西，大于0则有.
        if (count-- == 0) {
            return -1;
        }

        String result = pack();
        cb.append(result + "\r");                           //读取数据

        return result.length();                             //所以这里给了一个大于0的数字
    }
}

public class exam16 {
    public static void main(String[] args) {
//        charxu charxu = new charxu();
//        for (int i=0; i<5; i++){
//            System.out.println(charxu.pack());
//        }

        Scanner a = new Scanner(new adapted(5));
        while (a.hasNext()){
            System.out.println(a.next() + " ");
        }
    }
}
