package projects;

public class project8 {
    public static void main(String[] args) {
        int[] numbers={45,89,643,789,432,0,45,67,785};

            int max=numbers[0];
            int min=numbers[0];
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }if(numbers[i]<min){
            min=numbers[i];
        }
    }
        System.out.println("Array elements: ");
        for(int number:numbers){
            System.out.println(number+" ");
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
}}
