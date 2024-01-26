/**
 * Passenger class represents a passenger on a flight
 */
public class Passenger {

    private String name;
    private int age;
    private String nationality;

    /**
     * Constructs a new Passenger object with the given details
     *
     * @param name        The name of the passenger
     * @param age         The age of the passenger
     * @param nationality The nationality of the passenger
     */

    public Passenger(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    /**
     * Prints information about the passenger.
     */

    public void printInfo() {
        System.out.println("\nname: " + name + "\nage: " + age + "\nnationality: " + nationality + "\n\n");
    }

}
