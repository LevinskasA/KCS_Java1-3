package uzd5_Didesnis;

import java.io.*;
import java.util.*;

/**
 * Created by Askew on 3/1/2017.
 */
public class AutoServisas {
    private Map<Client, ClientInfo> clients = new LinkedHashMap<>();

    public static void main(String[] args) {
        // File format:
        // firstName,lastName,city,phoneNumber,servicesCount
        // carYear,carModel(carParts)?
        // (linesAmount = servicesCount) partPrice,servicePrice

        File clientFile = new File("src/uzd5_Didesnis/Clients.txt");

        AutoServisas p = new AutoServisas();
        p.readClientFile(clientFile);
        // startMenu returns true when exit is triggered.
        boolean exit = false;
        while (!exit) {
            p.startMenu(clientFile);
        }

        System.out.println("main end.");
    }

    // reads clientFile, adds all clients to Map<Client,ClientInfo>clients
    //unfinished while(){...}
    private void readClientFile(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                putClientFromLine(line, clients, reader);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Client file not found.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOE");
        }

    }


    // Puts Client & ClientInfo into passed Map. Handles file format.
    // EXCLUDES: CarParts part.
    private void putClientFromLine(String line, Map<Client, ClientInfo> clients, BufferedReader reader) {
        String[] values = line.split(",");
        // Client
        Client client = new Client(values[0], values[1], values[2], values[3]);
        // ClientInfo part.
        try {
            // Car
            line = reader.readLine();
            String[] carValues = line.split(",");
            Car car = new Car(Integer.parseInt(carValues[0]), CarModel.valueOf(carValues[1]));
            // Services
            int servicesCount = Integer.parseInt(values[4]);
            ClientInfo clientInfo = new ClientInfo(car);
            // Reads and adds given amount of services.
            for (int i = 0; i < servicesCount; i++) {
                line = reader.readLine();
                String[] serviceValues = line.split(",");
                clientInfo.addService(new Service(Float.parseFloat(serviceValues[0]), Float.parseFloat(serviceValues[1])));
            }
            clients.put(client, clientInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // True if exit was triggered.
    private boolean startMenu(File clientFile) {
        System.out.println("Pasirinkite: ");
        System.out.println("1 - Naujo kliento įvedimas.");
        System.out.println("2 - Įvesti atliktą paslaugą.");
        System.out.println("3 - Kliento šalinimas.");
        System.out.println("4 - Informacija apie klientą.");
        System.out.println("5 - Rodyti nesumokėjusius klientus.");
        System.out.println("6 - Rodyti sumokėjusius klientus.");
        System.out.println("7 - Klientai išrikiuoti pagal pavardes.");
        System.out.println("8 - TOP5 gendantys automobiliai.");
        System.out.println("0 - Baigti darbą.");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine().trim();
        while (!isOptionValid(option)) {
            System.out.println("Įveskite tinkamą pasirinkimą.");
            option = scanner.nextLine().trim();
        }
        scanner.close();

        return openOption(option, clientFile);

    }

    /// checks if passed string is startMenu compatible.
    private boolean isOptionValid(String option) {
        final Set<String> validOptions = new HashSet<>(Arrays.asList(
                new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "0"}));
        return validOptions.contains(option);
        /*
        String[] validOptions = {"1", "2", "3", "4", "5", "6", "7", "8", "0"};
        boolean contains = false;
        for (String validOption : validOptions) {
            if (validOption.equals(option)) {
                contains = true;
            }
        }
        return contains;
        */
    }

    /// Opens passed option's menu. Defaults to startMenu. Returns true if exit was triggered.
    private boolean openOption(String option, File clientFile) {
        switch (option) {
            case "1":
                inputNewClient(clientFile);
                break;
            case "2":
                //removeClient();
                break;
            case "3":
                //getClientByName();
                break;
            case "4":
                //outputIndebtClients();
                break;
            case "5":
                //outputDebtFreeClients();
                break;
            case "6":
                //outputClientsByLastName();
                break;
            case "7":
                //top5WorstCars();
                break;
            case "0":
                exitProgram(clientFile);
                break;
            default:
                startMenu(clientFile);
        }

        return (option.equals("0"));

    }

    private void outputAllClients(Map<Client, ClientInfo> clients) {
        List<Client> clientList = new ArrayList<>(clients.keySet());
        for (Client client : clientList) {
            System.out.println(client.toString());

        }
    }

    // Another method to add services to client?
    private void inputNewClient(File clientFile) {
        System.out.println("test");

    }

    // Overwrites clientFile with Map<,>clients in expected format.
    private void exitProgram(File clientFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(clientFile, false));
            List<Client> clientsArray = new ArrayList<>(clients.keySet());

            for (Client client : clientsArray) {
                int clientServicesCount = clients.get(client).getServices().size();
                // Client info
                writer.write(client.toFileFormat() + "," + clientServicesCount);
                writer.newLine();
                // Car info
                writer.write(clients.get(client).getCar().toFileFormat());
                writer.newLine();
                // Services info
                for (int i = 0; i < clientServicesCount; i++) {
                    writer.write(clients.get(client).getService(i).toFileFormat());
                    writer.newLine();
                }

            }
            writer.close();
            System.out.println("Duomenys sėkmingai įrašyti.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
