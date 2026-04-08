package core.mate.academy.model;

public class Excavator extends Machine {
    private int armLength;
    private int trackFrameWidth;

    public Excavator() {
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public int gettrackFrameWidth() {
        return trackFrameWidth;
    }

    public void settrackFrameWidth(int trackFrameWidth) {
        this.trackFrameWidth = trackFrameWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
