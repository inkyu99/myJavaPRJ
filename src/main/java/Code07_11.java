class Rabbit3 {
    String shape;
    int xPos;
    int yPos;


    Rabbit3(String value) {
        shape = value;
    }
}

public class Code07_11 {
    public static void main(String[]args){
        Rabbit3 rabbit1 = new Rabbit3("원");
        Rabbit3 rabbit2 = new Rabbit3("삼각형");
        Rabbit3 rabbit3 = new Rabbit3("토끼");


        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼 객체의 기본 모양은 [%s]입니다.\n", rabbit3.shape);

    }
}