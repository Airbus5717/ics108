public class Truck extends Vehicle {
    private int load;

    public Truck(double speed, int gears, int wheels, int load) {
        super(speed, gears, wheels);
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + " ,load:" + load;
    }

    /*
     * public int getLoad() { return load; }
     * 
     * public void setLoad(int load) { this.load = load; }
     */

}
