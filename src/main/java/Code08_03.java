class Rabbit7 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}
class HouseRabbit7 extends Rabbit6 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 사료를 먹습니다.");
    }
}
class MountainRabbit7 extends Rabbit6 {
    String mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}
public class Code08_03 {
    public static void main(String[] args) {
        HouseRabbit1 hRabbit = new HouseRabbit1();
        MountainRabbit7 mRabbit = new MountainRabbit7();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난생이";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.mountain = "설악산";
        mRabbit.move(200, 200);
        mRabbit.eatWildglass();
    }
}







