package projects;
/*
Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.
 */
public class project4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {12, 34, 56, 45, 76, 87},
                {23, 43, 54, 65, 76, 87}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 != 0) {
                    System.out.print(numbers[i][j] + " ");

                }
            }
            System.out.println();

        }
    }}
