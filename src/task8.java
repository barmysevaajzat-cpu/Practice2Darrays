import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        int count = 0;
        for (int j = 0; j < num.length; j++) {
            for (int i = 0; i < num.length; i++) {
                if (num[i][j] > number) {
                    count++;
                }
            }
        }
        System.out.println("Numbers greater than " + number + ": " + count);
    }
}
