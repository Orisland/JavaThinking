package U7;

class teacher{
    teacher(){
        System.out.println("techer is coming!");
    }
}

class student extends teacher{
    student(){
        System.out.println("student is siting on the chair");
    }
}

class classroom extends student{
    classroom(){
        System.out.println("The place to teache and learn!");
    }
}

class speak extends student{
    classroom classroom = new classroom();      //默认创建一次，然后再创建第二次classroom，所以输出两次。
}

public class Teach extends classroom {
    public static void main(String[] args) {
        //Teach teach = new Teach();
        speak speak = new speak();
    }
}
