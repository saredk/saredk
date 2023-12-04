package projects;
//write a program to find the second largest number in the array
public class project9 {
    public static void main(String[] args) {
        int[] numbers={45,89,643,789,432,31,45,67,785};

        int firstlargest=numbers[0];
        int secondlargest=numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>firstlargest) {
                firstlargest = numbers[i];



    }else if(numbers[i]>secondlargest&&numbers[i]<firstlargest&&secondlargest!=firstlargest){
             secondlargest=numbers[i];


    }


    }System.out.println("First largest number :"+firstlargest);
        System.out.println("Second largest number :"+secondlargest);
    }}