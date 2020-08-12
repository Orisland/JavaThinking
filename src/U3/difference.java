package U3;

public class difference {
    public static void main(String[] args) {
        String str1 = "字符串1";
        String str2 = "字符串2";
        String str3 = "字符串1";
        String str4 = "abc";
        String str5 = "abc";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        if (str1 == str2){
            System.out.println("str1和str2相同");
        }
        if (str1 == str3){
            System.out.println("str1和str3相同");
        }
        if (str4 == str5){
            System.out.println("str4和str5相同");
        }

    }
}
