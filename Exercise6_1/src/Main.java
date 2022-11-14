import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        for (int j = 1;j <= 10; ++j) {
            System.out.printf("%d * %d = %d \n", num, j, num * j);
        }

    }
}