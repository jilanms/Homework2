public class Vehicle {
    private double fuel;
    private double mpg;
    private int currentSpeed;
    private double baseMpg;
    private double scaleFactor;

    public void updateMpg(){
        setMpg(mpg);
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getBaseMpg() {
        return baseMpg;
    }

    public void setBaseMpg(double baseMpg) {
        this.baseMpg = baseMpg;
    }

    public double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

}