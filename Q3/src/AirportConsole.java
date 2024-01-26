import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AirportConsole {

    CSVHandler handler;
    Scanner scanner;

    public AirportConsole() throws IOException {
        handler = new CSVHandler();
        scanner = new Scanner(System.in);
    }

    public void runConsole() {
        HashMap<String, String> airportMap = handler.getAirportMap();
        boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("1. Print all airports");
            System.out.println("2. Search for an airport");
            System.out.println("3. Remove an airport");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            System.out.println();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    printAllAirports(airportMap);
                    break;
                case 2:
                    searchAirport(airportMap);
                    break;
                case 3:
                    removeAirport(airportMap);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }
        }
    }

    private void printAllAirports(HashMap<String, String> airportMap) {
        for (HashMap.Entry<String, String> entry : airportMap.entrySet()) {
            System.out.println("Airport Code: " + entry.getKey() + ", Airport Name: " + entry.getValue());
        }
    }

    private void searchAirport(HashMap<String, String> airportMap) {
        System.out.print("Enter the airport code to search: ");
        String searchCode = scanner.nextLine().toUpperCase();
        String airportName = airportMap.get(searchCode);

        if (airportName != null) {
            System.out.println("Airport found - Airport Name: " + airportName);
        } else {
            System.out.println("Airport not found for code: " + searchCode);
        }
    }

    private void removeAirport(HashMap<String, String> airportMap) {
        System.out.print("Enter the airport code to remove: ");
        String removeCode = scanner.nextLine().toUpperCase();

        if (airportMap.containsKey(removeCode)) {
            airportMap.remove(removeCode);
            System.out.println("Airport removed successfully.");
        } else {
            System.out.println("Airport not found for code: " + removeCode);
        }
    }

}
