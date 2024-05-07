class Rabbit2 {
    String shape;
    int xPos;
    int yPos;

    Rabbit2() {

        shape = "토끼";
    }
    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}
public class Code07_10 {
    public static void main(String[] args) {
        Rabbit2 rabbit = new Rabbit2();

        System.out.printf("토끼 객체의 기본 모양은 [%S]입니다.", rabbit.shape);
    }
}
