package projects;
/*
Create a program that uses an array to
store a list of temperatures for a week,
and then uses a loop to find the highest
and lowest temperature for the week.
 */
public class project1 {
    public static void main(String[] args) {
        int[] temp={23,32,34,28,30,32,34};
        int highestTemp=temp[0];
        int lowestTemp=temp[0];
        for(int i=0; i<temp.length;i++){
            if(temp[i]>highestTemp){
                highestTemp=temp[i];
            }if(temp[i]<lowestTemp){
                lowestTemp=temp[i];
            }
        }
        System.out.println("The highest temperature for the week: "+highestTemp);
        System.out.println("The lowest temperature for the week: "+lowestTemp);

    }


    }
