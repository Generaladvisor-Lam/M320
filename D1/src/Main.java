public class Main {
    public static void main(String[] args) {
        Heater heater = new Heater(28, 5);
        heater.increaseTemperature();
        System.out.println(heater.getTemperature());
    }
}