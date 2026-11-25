public class task12{
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 70, 100},
                {60, 75, 85, 95},
                {88, 92, 79, 81}
        };
        int classMax = scores[0][0];
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                if (scores[i][j] > classMax) {
                    classMax = scores[i][j];
                }
            }
            total += sum;
            double average = (double) sum / scores[i].length;
            System.out.println("Student " + (i + 1) +  " average: " + average);
        }
        System.out.println("Class maximum: " + classMax);
        int count = scores.length * scores[0].length;
        double overall = (double) total / count;
        System.out.println("Overall average: " + overall);
    }
}