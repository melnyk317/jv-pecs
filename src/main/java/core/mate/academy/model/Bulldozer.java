package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bucketWidth;
    private boolean heveRipper;

    public Bulldozer() {
    }

    public int getBucketWigth() {
        return bucketWidth;
    }

    public void setBucketWigth(int bucketWigth) {
        this.bucketWidth = bucketWigth;
    }

    public boolean getHeveRipper() {
        return heveRipper;
    }

    public void setHeveRipper(boolean heveRipper) {
        this.heveRipper = heveRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
