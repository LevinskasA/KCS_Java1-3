package uzd2_17;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Askew on 2/28/2017.
 */
public class uzd2_17 {
    public static void main(String[] args) {

        File file = new File("palindromes.txt");
        readInput(file);

    }


    private static void readInput(File file) {
        String line = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            while ((line = bf.readLine()) != null) {
                System.out.println("Iš failo paimta eilutė: " + line);
                output(isPalindrome(line));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    // Returns if passed String is a palindrome.
    private static boolean isPalindrome(String line) {
        // removing whitespace from string
        line = line.replaceAll("\\s", "");
        // checking if palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < line.length() / 2 && isPalindrome; i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                isPalindrome = false;

            }
        }
        return isPalindrome;

    }

    private static void output(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("Palindromas.");
        } else {
            System.out.println("Ne palindromas.");
        }


    }


}
