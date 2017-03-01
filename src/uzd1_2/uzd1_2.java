package uzd1_2;

import java.util.Scanner;

/**
 * Created by Askew on 2/27/2017.
 */
public class uzd1_2 {
    public static void main(String[] args) {
        System.out.println("Iveskite zodi:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Zodyje " + line.length() + " raides.");
    }
}
