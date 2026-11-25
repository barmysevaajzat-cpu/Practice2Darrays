public class task7 {
    public static void main(String[] args) {
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int j = 0; j < num[0].length; j++) {
            int colsum = 0;
            for (int i = 0; i < num.length; i++) {
                colsum += num[i][j];
            }
            System.out.println("Column " + j + ": " + colsum);
        }
    }
}
