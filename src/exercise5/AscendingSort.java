package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        // Sort numbers in ascending order
        for(int j=0; j<numbers.length; j++){
          for(int k=0; k<numbers.length -1; k++){
            int temp=0;
            if(numbers[k]>numbers[k+1]){
              temp=numbers[k];
              numbers[k]=numbers [k+1];
              numbers[k+1] = temp;
            }
          }
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
