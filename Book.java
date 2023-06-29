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
    
    public void setCategory(String category) {
        this.category = category;
    }
        
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCategory() {
        return category;
    }
}
