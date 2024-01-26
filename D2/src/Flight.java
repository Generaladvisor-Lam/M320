import java.util.ArrayList;

/**
 * Flight class represents a flight with passengers
 */
public class Flight {

    ArrayList<Passenger> passengers;

    /**
     * Flight object constructor initiating 6 default passengers
     */
    public Flight() {
        passengers = new ArrayList<>() {{
            add(new Passenger("Wigbert", 88, "Germany"));
            add(new Passenger("Sieglinde", 75, "Germany"));
            add(new Passenger("Frieda", 65, "Germany"));
            add(new Passenger("Julie", 50, "Germany"));
            add(new Passenger("Jonas", 76, "Germany"));
            add(new Passenger("Augusta", 32, "Germany"));
        }};
    }

    /**
     * Removes a passenger from the flight
     *
     * @param id The ID of the passenger to remove
     * @return True if the passenger was removed, false if the ID is invalid
     */

    public boolean removePassenger(int id) {
        if (id >= 0 && id < passengers.size()) {
            passengers.remove(id);
            return true;
        } else return false;
    }

    /**
     * Adds a new passenger to the flight
     *
     * @param passenger The passenger to add
     */

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    /**
     * Gets the list of passengers on the flight
     *
     * @return The list of passengers
     */

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }
}
