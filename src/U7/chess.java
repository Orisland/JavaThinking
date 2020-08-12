package U7;

class game{
    game(int i){
        System.out.println("游戏开始");
    }
}

class chessgame extends game{
    private String flag;
    chessgame(int i, String flag){
        super(i);
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }
}

class player extends chessgame{
    private int num;
    player(int i){
        super(2,"ready");       //首先初始化父类对象,这个和py差不多.
        this.num = i;
        System.out.println(getNum());
    }

    public String getNum() {
        String str = "该游戏游戏玩家为:";
        return str+num;
    }

    @Override
    public String getFlag() {
        return super.getFlag();
    }
}

public class chess {
    public static void main(String[] args) {
        player player = new player(2);
    }
}
