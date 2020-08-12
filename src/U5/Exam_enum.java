package U5;


public class Exam_enum {
    public enum meiju{
        TEST, shoot, a, b, c;
    }

    public enum letter{
        a, b, c, d, e, f
    }

    public static class putout{
        letter letter;
        public putout(letter letter){
            this.letter = letter;
        }
        public void miaoshu(){
            System.out.println("choose:");
            switch (this.letter){
                case a:
                    System.out.println("a");
                    break;
                case b:
                    System.out.println("b");
                    break;
                case c:
                    System.out.println("c");
                    break;
                case d:
                    System.out.println("d");
                    break;
                case e:
                    System.out.println("e");
                    break;
                case f:
                    System.out.println("f");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        putout test = new putout(letter.a);     //注意static
        test.miaoshu();
//        for (meiju test:meiju.values()){                    //test.ordinal()显示第几个
//            System.out.println(test + String.valueOf(test.ordinal()));
//        }

    }
}

