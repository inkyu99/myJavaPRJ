import java.util.Scanner;

public class Quiz0409 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
                System.out.println("시작값 :");
                a = s.nextInt();
                System.out.println("두 번째가 끝나는 값: ");
                b = s.nextInt();
        for (int i = a ; i>=b ; i--){
            System.out.println(i);
        }
        s.close();
    }
}
