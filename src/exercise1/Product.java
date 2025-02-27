package exercise1;

public class Product {
    private Integer price;
    private String name;
    private String description;
    private Integer quantity;

    public Product(Integer price, String name, String description, Integer quantity) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }

    public Integer getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product {" +
                "price: " + price +
                ", name: '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", quantity: " + quantity +
                '}';
    }
}
