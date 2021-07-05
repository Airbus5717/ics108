public class Item {
    private String name;
    private int id;
    private double price;

    public Item() {
        this.name = null;
        this.id = 0;
        this.price = 0;
    }

    public Item(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updatePrice(double price) {
        this.price = price;
    }
}
