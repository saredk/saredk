package projects;
/*
Create an array of integer values.
After the array is created, calculate the
sum of all stored elements in that array.

 */

public class project2 {
    public static void main(String[] args) {
        int [] numbers={12,34,56,78,98,54,76,35};
        int sum=0;
        for(int i=0; i< numbers.length; i++){
            sum+=numbers[i];

        } System.out.println("Sum of all stored elements :"+ sum);

    }
}
