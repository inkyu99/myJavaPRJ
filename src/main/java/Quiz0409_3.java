import java.util.Scanner;

public class Quiz0409_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.println("시작값 :");
        a = s.nextInt();
        System.out.println("끝나는 값: ");
        b = s.nextInt();
        if ( a> b)
        for (int i = a; i > b; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        else{
            for (int i = a; i < b; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}


