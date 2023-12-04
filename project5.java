package projects;
/*
Write a program to swap 2 numbers
without a temporary variable?
 */
public class project5 {
    public static void main(String[] args) {
        int [] swapNum={5,10};
        int num1=5;
        int num2=10;
        System.out.print("Before swapping: num1 ="+ num1+" num2 ="+num2 );
        System.out.println();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.print("After swapping: num1 ="+ num1+" num2 ="+num2 );


    }
}
