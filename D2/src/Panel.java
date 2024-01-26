import java.util.ArrayList;
import java.util.Scanner;

/**
 * Panel class represents user interaction with Flight class
 */
public class Panel {
    private Flight flight;
    private Scanner scan;

    /**
     * Panel object constructor
     */
    public Panel() {
        flight = new Flight();
        scan = new Scanner(System.in);
    }

    /**
     * Runs the main loop for user interactions.
     */
    public void run() {
        while (true) {
            System.out.println("choose an action\n [1] print passengers\n [2] add a passenger \n [3] remove a passenger");
            switch (scan.nextLine()) {
                case ("1"):
                    printPassengers();
                    break;
                case ("2"):
                    addPassenger();
                    break;
                case ("3"):
                    removePassenger();
                    break;
                default:
                    System.out.println("not an option\n");
            }
        }
    }

    private void addPassenger() {
        String name;
        int age;
        String nationality;
        System.out.println("enter name of the passenger:");
        name = scan.nextLine();
        System.out.println("enter age of the passenger");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("enter nationality of the passenger");
        nationality = scan.nextLine();
        flight.addPassenger(new Passenger(name, age, nationality));
        System.out.println("passenger added.");
    }

    private void printPassengers() {
        ArrayList<Passenger> passengers = flight.getPassengers();
        for (int i = 0; i < passengers.size(); ++i) {
            System.out.println("\npassenger id: " + i);
            passengers.get(i).printInfo();
        }
    }

    private void removePassenger() {
        int id;
        System.out.println("enter passenger id");
        id = scan.nextInt();
        scan.nextLine();
        if (flight.removePassenger(id)) {
            System.out.println("passenger removed\n");
        } else System.out.println("id doesn't exist\n");
    }

}
