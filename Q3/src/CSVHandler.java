import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVHandler {

    private HashMap<String, String> airportMap;

    public CSVHandler() throws IOException {
        airportMap = new HashMap<>();
        readCSV();
    }


    private void readCSV() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\0_PLJ\\M320\\M320\\Q3\\src\\airports.csv"))) {
            String line;
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String airportCode = parts[0].trim();
                    String airportName = parts[1].trim();
                    airportMap.put(airportCode, airportName);
                }
            }
        }
    }

    public HashMap<String, String> getAirportMap() {
        return airportMap;
    }
}
