package abstrakcje2;

public class MotorBike extends Vehicle {

    private int speedLimit;

    public MotorBike(String name, int year, int speedLimit) {
        super(name, year);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "speedLimit=" + speedLimit +
                '}';
    }
}
