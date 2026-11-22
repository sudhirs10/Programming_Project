import java.util.Random;

public class OrientationTask3_2 {
    public static void main(String[] args) {
        int[] studentAges = {19, 20, 20, 21, 21, 21, 24};
        int numberOfPicks = 1000;

        for (int run = 1; run <= 3; run++) {
            Random random = new Random(run);
            int[] ageCounts = new int[25];

            for (int pick = 0; pick < numberOfPicks; pick++) {
                int index = random.nextInt(studentAges.length);
                int age = studentAges[index];
                ageCounts[age]++;
            }

            System.out.println("Run " + run);
            System.out.println("Age   Count   Percentage");

            for (int age = 0; age < ageCounts.length; age++) {
                if (ageCounts[age] > 0) {
                    double percentage = ageCounts[age] * 100.0 / numberOfPicks;
                    System.out.printf("%-5d %-7d %.1f%%%n",
                            age, ageCounts[age], percentage);
                }
            }

            System.out.println();
        }
    }
}