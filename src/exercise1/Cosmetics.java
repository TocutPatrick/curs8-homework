package exercise1;

public class Cosmetics extends Product{
    private String color;
    private Integer weight;

    public Cosmetics(Integer price, String name, String description, Integer quantity, String color, Integer weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cosmetics {" +
                "color: '" + color + '\'' +
                ", weight: " + weight +
                "} " + super.toString();
    }
}
