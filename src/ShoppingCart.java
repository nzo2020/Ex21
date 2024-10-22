public class ShoppingCart {
    private Product[] products;

    public ShoppingCart(Product[] products) {
        this.products = new Product[10];
    }


    public void calculateTotal() {
        double sum = 0;
        for (Product p : products) {
            sum = sum + p.getPrice();
        }
        System.out.println("The total price is: " + sum);
    }
}
