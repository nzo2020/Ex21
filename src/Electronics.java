public class Electronics extends Product {

    public Electronics(String name, double price, String description, String author) {
        super(name, price, description);
    }

    @Override
    public String getName() {
        return "The name of the electronics is: " + super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 30;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + super.getDescription();
    }
}