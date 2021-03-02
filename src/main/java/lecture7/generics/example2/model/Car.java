package lecture7.generics.example2.model;

public class Car {
    private long engineSerialNumber;
    private int serialNumber;

    public Car(long engineSerialNumber, int serialNumber) {
        this.engineSerialNumber = engineSerialNumber;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineSerialNumber=" + engineSerialNumber +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
