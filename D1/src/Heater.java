public class Heater {

    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heater(int temperature, int increment) {
        this.temperature = temperature;
        this.increment = increment;
    }

    public void increaseTemperature() {
        temperature = temperature + increment;
    }

    public void decreaseTemperature() {
        temperature = temperature - increment;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
}
