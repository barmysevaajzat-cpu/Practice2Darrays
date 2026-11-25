public class task11 {
    public static void main(String[] args) {
        int[][] num = {
                {1, -2, 3},
                {4, -5, 6},
                {7, -8, 9}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i][j] < 0) {
                    num[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}