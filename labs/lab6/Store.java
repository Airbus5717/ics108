class Store {
    public static void main(String[] args) {
        Item[] store = new Item[3];

        store[0] = new Item();
        store[0].setId(11);
        store[0].setName("Milk");
        store[0].updatePrice(4.5);

        store[1] = new Item("Juice", 12, 3.5);
        store[2] = new Item("Water", 13, 1.0);

        for (Item element : store) {
            double j = element.getPrice();
            element.updatePrice(j + j * (15.0 / 100.0));
        }

        for (Item element : store) {
            System.out.print("ID: " + element.getId() + "  ");
            System.out.print("Name: " + element.getName() + "   ");
            System.out.println("Price: " + element.getPrice() + "  ");
        }
    }
}
