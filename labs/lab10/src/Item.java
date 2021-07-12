import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private int id;
    private double price;

    public Item(String name, int id, double price) {
        this.setName(name);
        this.setId(id);
        this.setPrice(price);
    }

    public Item() {
        this.setId(0);
        this.setName(null);
        this.setPrice(0.0);
    }

    @Override
    public String toString() {
        return "Item (name: " + name + ", id: " + id + ", price: " + price + ")";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void updatePrice(double percent) {
        this.price = price + (percent / 100.0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
