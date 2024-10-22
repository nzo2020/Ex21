public class Book extends Product {

    public Book(String name, double price, String description, String author) {
        super(name, price, description);
    }

    @Override
    public String getName() {
        return "The name of the book is: " + super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }

    @Override
    public String getDescription() {
        return "Book: " + super.getDescription();
    }
}