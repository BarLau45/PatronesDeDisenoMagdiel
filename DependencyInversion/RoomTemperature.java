package DependencyInversion;

public class RoomTemperature {
    private double temperatureValue;

    public RoomTemperature(double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    private RoomTemperature getInstance() {
        return new RoomTemperature(temperatureValue);
    }

    public double getTemperature() {
        return temperatureValue;
    }
    public void setTemperature(double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }
}
