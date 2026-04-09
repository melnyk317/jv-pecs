package core.mate.academy.model;

public class Truck extends Machine {
    private int dumpBoxVolume;
    private int numberOfWheels;

    public Truck() {
    }

    public int getDumpBoxVolume() {
        return dumpBoxVolume;
    }

    public void setDumpBoxVolume(int dumpBoxVolume) {
        this.dumpBoxVolume = dumpBoxVolume;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
