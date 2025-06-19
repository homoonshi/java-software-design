package cohesion.sequential;

import java.util.UUID;

public class Item {
    private UUID itemId;
    private String name;
    private double price;

    public Item(String name, double price){
        this.itemId = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public UUID getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
