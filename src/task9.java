import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();

        for (int j = 0; j < num.length; j++) {
            for (int i = 0; i < num.length; i++) {
                if (number == num[i][j]) {
                    System.out.println("Number matching to your number: i[" + i + "]j[" + j + "]");
                }
            }
        }
    }
}