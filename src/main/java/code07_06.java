class Rabbit {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;

        System.out.println("xPos : " + xPos + " / yPos : " + yPos);
    }
}

public class code07_06{
    public static void main(String[] args){
        Rabbit rb1 = new Rabbit();
        rb1.setPosition(100, 100);
        Rabbit rb2 = new Rabbit();
        rb2.setPosition(200, 200);
    }
}
