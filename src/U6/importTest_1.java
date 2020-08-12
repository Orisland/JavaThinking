package U6;

class sum{
    int a, b;
    sum(int a, int b){      //构造方法
        this.a = a;
        this.b = b;
    }

    int sum(){
        return a+b;
    }

    int cheng(){
        return a*b;
    }

    String putout(){
        String str1 = "a:"+a;
        String str2 = "b:"+b;
        String str3 = " ";
        return str1+str3+str2;
    }
}
