public class taskA {
    public static void main(String[] args) {
        int[][] a = {
                {70, 80, 90, 100},
                {60, 70, 80, 90},
                {65, 75, 85, 95}
        };
        int bestRow = 0;
        int bestSum = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + i + " sum: " + sum);
            if (i ==0 || sum > bestSum) {
                bestSum = sum;
                bestRow = i;
            }
        }
        System.out.println("Largest row: " + bestRow + " with sum " + bestSum);
    }
}

