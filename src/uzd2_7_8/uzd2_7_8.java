package uzd2_7_8;

import java.util.Scanner;

/**
 * Created by Askew on 2/28/2017.
 */
public class uzd2_7_8 {
    public static void main(String[] args) {
        outputNumbers(readInput());
    }
    // returns array input by user
    private static int[] readInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek skaiciu norite ivesti?");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    // outputs all numbers above 100 from passed array.
    private static void outputNumbers(int[] numbers){
        System.out.println("Ivesti skaiciai, didesni uz 100:");
        for (Integer number : numbers){
            if (number > 100){
                System.out.println(number);
            }
        }

    }

}
