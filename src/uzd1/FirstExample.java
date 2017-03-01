package uzd1;

import java.util.Scanner;

/**
 * Created by Askew on 2/27/2017.
 */
public class FirstExample {
    public static void main(String[] args) {
        System.out.println("Please insert your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("You inserted >> " + name);

    }

}
