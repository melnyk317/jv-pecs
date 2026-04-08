package core.mate.academy.model;

public class Excavator extends Machine {
    private int armLength;
    private int trackFrameWeigth;

    public Excavator() {
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public int getTrackFrameWeigth() {
        return trackFrameWeigth;
    }

    public void setTrackFrameWeigth(int trackFrameWeigth) {
        this.trackFrameWeigth = trackFrameWeigth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
