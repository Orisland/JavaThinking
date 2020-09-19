package U10;

public class Abstract_2 {
    public Destination destination(String dest, float price){
        return new Destination(){
            @Override
            public String readline() {
                return null;
            }

            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100){
                    System.out.println("over budget");
                }
            }
            private String label = dest;
            public String readLabel(){
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Abstract_2 abstract_2 = new Abstract_2();
        Destination ds = abstract_2.destination("tasmania",101.395F);
    }
}
