package uzd1_6;

import java.util.Scanner;

/**
 * Created by Askew on 2/27/2017.
 */
public class uzd1_6 {
    public static void main(String[] args) {
        System.out.println("Iveskite savo mase");
        Scanner scanner = new Scanner(System.in);
        double mase = scanner.nextDouble();
        System.out.println("Iveskite savo ugi");
        double ugis = scanner.nextDouble();

        System.out.println("Jusu KMI: " + kmi(mase, ugis));
    }

    private static double kmi(double mase, double ugis)
    {
        return mase / Math.pow(ugis, 2.0);
    }
}
