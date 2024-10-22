public class Clothing extends Product {

    public Clothing(String name, double price, String description, String author) {
        super(name, price, description);
    }

    @Override
    public String getName() {
        return "The name of the clothing brand is: " + super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + super.getDescription();
    }
}
