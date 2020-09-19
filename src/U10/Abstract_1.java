package U10;

/**
 * 牛逼当我翻来覆去找Destination到底为什么出错的时候，
 * 你却在本章的开头就已经说了。
 * 这波你在第五层
 * 我在地下室。
 * 2020年9月16日17:20:47
 */

interface Destination{      //这是很早就留的接口，不是javax里的那个什么玩意
    String readline();
}

interface contents{
    int value();
}

public class Abstract_1 {
    public Destination destination(String dest){        //这没加final也没报错啊^
        return new Destination(){
            private String label = dest;
            public String readline(){
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Abstract_1 a = new Abstract_1();
        Destination d = a.destination("tasmania");
    }
}
