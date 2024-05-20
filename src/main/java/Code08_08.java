abstract class Rabbit8 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
    abstract void sleep();
}
class HouseRabbit extends Rabbit8 {
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}
class MountRabbit2 extends Rabbit8 {
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code008_08{

    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountRabbit2 mRabbit = new MountRabbit2();

        hRabbit.sleep();
        mRabbit.sleep();


        }
}

