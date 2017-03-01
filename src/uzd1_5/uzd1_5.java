package uzd1_5;

import java.util.Scanner;

/**
 * Created by Askew on 2/27/2017.
 */
public class uzd1_5 {
    public static void main(String[] args) {
        System.out.println("Iveskite du skaicius:");
        Scanner scanner = new Scanner(System.in);


        if (scanner.hasNextInt()) {
            int pirmas = scanner.nextInt();
            int antras = scanner.nextInt();

            System.out.println("Skaiciu suma:");
            System.out.println(suma(pirmas, antras));
            System.out.println("Skaiciu skirtumas");
            System.out.println(skirtumas(pirmas, antras));

        } else if (scanner.hasNextFloat()){
            float pirmas = scanner.nextFloat();
            float antras = scanner.nextFloat();

            System.out.println("Skaiciu suma:");
            System.out.println(suma(pirmas, antras));
            System.out.println("Skaiciu skirtumas");
            System.out.println(skirtumas(pirmas, antras));
        }


    }


    private static int suma(int a, int b){
        return a+b;
    }
    private static int skirtumas(int a, int b){
        return a-b;
    }

    private static float suma(float a, float b){
        return a+b;
    }
    private static float skirtumas(float a, float b){
        return a-b;
    }


}
