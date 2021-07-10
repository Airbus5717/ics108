import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Vehicle(10, 5, 4));
        vehicles.add(new Vehicle(20, 4, 2));
        vehicles.add(new Truck(30, 8, 9, 100));
        vehicles.add(new Truck(40, 6, 6, 100));
        vehicles.add(new Vehicle(30, 2, 4));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}
