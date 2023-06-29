public class Book {
    private String name;
    private double price;
    private String category;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
        this.category = BOOKS_AND_COMICS;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price; 
    }
        
    @Override
    public String getCategory() {
        return category;
    }
}
