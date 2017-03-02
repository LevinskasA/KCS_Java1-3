package uzd5_Didesnis;

import java.io.*;
import java.util.*;

/**
 * Created by Askew on 3/1/2017.
 */
public class AutoServisas {
    public static void main(String[] args) {
        File clientFile = new File("uzd5_Didesnis/Clients.txt");
        //
        Map<Client, ClientInfo> clients = new LinkedHashMap<Client, ClientInfo>();
        AutoServisas p = new AutoServisas();
        p.readClientFile(clientFile, clients);

        p.startMenu();
    }

    //unfinished while(){...}
    private void readClientFile(File file, Map<Client, ClientInfo> clients) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                // placeholder
                String[] values = line.split(",");
                Client client = new Client(values[0], values[1], values[2], values[3]);
                clients.put(client, new ClientInfo());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Client file not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOE");
        }

    }

    private void startMenu() {
        System.out.println("Pasirinkite: ");
        System.out.println("1 - Naujo kliento įvedimas.");
        System.out.println("2 - Kliento šalinimas.");
        System.out.println("3 - Informacija apie klientą.");
        System.out.println("4 - Rodyti nesumokėjusius klientus.");
        System.out.println("5 - Rodyti sumokėjusius klientus.");
        System.out.println("6 - Klientai išrikiuoti pagal pavardes.");
        System.out.println("7 - TOP5 gendantys automobiliai.");
        System.out.println("0 - Baigti darbą.");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine().trim();
        while (!isOptionValid(option)) {
            System.out.println("Įveskite tinkamą pasirinkimą.");
            option = scanner.nextLine().trim();
        }
        scanner.close();

        openOption(option);

    }

    /// checks if passed string is startMenu compatible.
    private boolean isOptionValid(String option) {
        final Set<String> validOptions = new HashSet<String>(Arrays.asList(
                new String[]{"1", "2", "3", "4", "5", "6", "7", "0"}));
        return validOptions.contains(option);
        /*
        String[] validOptions = {"1", "2", "3", "4", "5", "6", "7", "0"};
        boolean contains = false;
        for (String validOption : validOptions) {
            if (validOption.equals(option)) {
                contains = true;
            }
        }
        return contains;
        */
    }

    /// Opens passed option's menu. Defaults to startMenu.
    private void openOption(String option) {
        switch (option) {
            case "1":
                inputNewClient();
                break;
            case "2":
                removeClient();
                break;
            case "3":
                getClientByName();
                break;
            case "4":
                outputIndebtClients();
                break;
            case "5":
                outputDebtFreeClients();
                break;
            case "6":
                outputClientsByLastName();
                break;
            case "7":
                top5WorstCars();
                break;
            case "0":
                exitProgram();
                break;
            default:
                startMenu();
        }
    }


}
