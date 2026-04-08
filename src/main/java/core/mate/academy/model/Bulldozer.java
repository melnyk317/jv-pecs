package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bucketWidth;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public int getBucketWidth() {
        return bucketWidth;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    public boolean isHasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
