package uzd2_3_4;

import sun.rmi.server.InactiveGroupException;

import java.util.Scanner;

/**
 * Created by Askew on 2/28/2017.
 */
public class uzd2_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veskite sveikus skaicius. Programa baigs darba, kai bus ivestas 0.");
        String line;
        int sum = 0;
        int current;
        //while ((line = scanner.next()) != "0")
        while (!("0".equals(line = scanner.nextLine()))) {
            if ((current = tryParseInteger(line)) != 0) {
                sum += current;
            } else {
                System.out.println("Iveskite sveika skaiciu.");
            }
        }
        System.out.println("Suvestu skaiciu suma: " + sum);
    }

    /// Returns 0 if integer can't be parsed. Otherwise returns the value.
    private static int tryParseInteger(String a) {
        int retValue;
        try {
            retValue = Integer.parseInt(a);
        } catch (NumberFormatException nfe) {
            retValue = 0;
        }
        return retValue;
    }
}
