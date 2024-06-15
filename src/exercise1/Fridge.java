package exercise1;

public class Fridge extends Electronics{
    private Integer temperature;

    public Fridge(Integer price, String name, String description, Integer quantity, String type, Integer length, Integer width, Integer height, Integer weight, Integer temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Fridge {" +
                "temperature: " + temperature +
                "} " + super.toString();
    }
}
