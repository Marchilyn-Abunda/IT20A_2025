package PRELIM;

public class ArrayLabActivity {

    public static void main(String[] args) {

        int number[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int totalSum = 0;
        System.out.println("Sum of each Row:");
        for (int i = 0; i < number[0].length; i++) {
            int rowSum = 0;

            for (int j = 0; j < number.length; j++) {

                rowSum += number[j][i];

            }
            System.out.println("Column " + (i + 1) + ": " + rowSum);

            totalSum += rowSum;
        }
        System.out.println("Total Sum:" + totalSum);
    }

}
