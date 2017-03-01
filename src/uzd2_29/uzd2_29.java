package uzd2_29;

import java.util.Scanner;

/**
 * Created by Askew on 2/28/2017.
 */
public class uzd2_29 {
    public static void main(String[] args) {
        startMenu();
    }

    private static void startMenu() {
        System.out.println("Pasirinkite: ");
        System.out.println("1 - vartotojų nuskaitymas iš failo. ");
        System.out.println("2 - naujo vartotojo įrašymas. ");
        System.out.println("3 - vartotojų paieška pagal vardą. ");
        System.out.println("4 - vartotojų paieška pagal pirmą vardo raidę. ");
        System.out.println("5 - vartotojų paieška pagal pirmą pavardės raidę. ");
        System.out.println("6 - vartotojų vyresnių nei (n) paieška. ");
        // Prompts user input until valid.
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (option < 1 || option > 6) {
            System.out.println("Bloga ivestis");
            option = scanner.nextInt();

        }
        scanner.close();
        // Valid option chosen. Calling it.
        switch (option) {
            case 1:
                readUsersFile();
                break;
            case 2:
                inputNewUser();
                break;
            case 3:
                searchByName();
                break;
            case 4:
                searchByFirstNameLetter();
                break;
            case 5:
                searchByLastNameLetter();
                break;
            case 6:
                searchByOlderThan();
                break;
            default:
                System.out.println("Something broke. Switch in startMenu.");
                break;
        }


    }



}
