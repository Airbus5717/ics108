public class Vehicle {
    private int wheels;
    private double speed;
    private int gears;

    public Vehicle(double speed, int gears, int wheels) {
        this.speed = speed;
        this.gears = gears;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "speed: " + speed + " ,gears: " + gears + " ,wheels: " + wheels;
    }

    /*
    * public double getSpeed() { return speed; }
    * 
    * public void setSpeed(double speed) { this.speed = speed; }
    * 
    * public int getGears() { return gears; }
    * 
    * public void setGears(int gears) { this.gears = gears; }
    * 
    * public int getWheels() { return wheels; }
    * 
    * public void setWheels(int wheels) { this.wheels = wheels; }
    */
}
