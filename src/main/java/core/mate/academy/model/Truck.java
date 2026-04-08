package core.mate.academy.model;

public class Truck extends Machine {
    private int dumpBoxVolume;
    private int numberOfWhells;

    public Truck() {
    }

    public int getDumpBoxVolume() {
        return dumpBoxVolume;
    }

    public void setDumpBoxVolume(int dumpBoxVolume) {
        this.dumpBoxVolume = dumpBoxVolume;
    }

    public int getNumberOfWhells() {
        return numberOfWhells;
    }

    public void setNumberOfWhells(int numberOfWhells) {
        this.numberOfWhells = numberOfWhells;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
