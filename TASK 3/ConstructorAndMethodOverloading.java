public class ConstructorAndMethodOverloading {

    // I took an example of a book to demonstrate the concept of constructor and
    // Method overloading

    // Fields declaration

    private String title;
    private String author;
    private double price;

    // Default constructor

    public ConstructorAndMethodOverloading() {
        this("UNKNOWN TITLE", "UNKNOWN AUTHOR", 0.0);
    }

    // Constructor with parameters

    public ConstructorAndMethodOverloading(String title) {
        this(title, "UNKNOWN AUTHOR", 0.0);
    }

    // Constructor with parameters

    public ConstructorAndMethodOverloading(String title, String author) {
        this(title, author, 0.0);
    }

    // Constructor with parameters

    public ConstructorAndMethodOverloading(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Printing the book details

    public void displayInfo() {
        System.out.println("TITLE : " + title + ", AUTHOR : " + author + ", PRICE : " + price);
    }

    // Method overloading

    public void setPrice(double price) {
        this.price = price;
    }

    // Method overloading

    public void setPrice(double price, double discount) {
        this.price = price - (price * discount / 100);
    }

    // Main method

    public static void main(String[] args) {

        ConstructorAndMethodOverloading book1 = new ConstructorAndMethodOverloading();

        // Calling constructor overloading

        ConstructorAndMethodOverloading book2 = new ConstructorAndMethodOverloading("EFFICIENCY");

        // Calling constructor overloading

        ConstructorAndMethodOverloading book3 = new ConstructorAndMethodOverloading("CLEAN CODE",
                "ROBERT C. MARTIN");

        // Calling constructor overloading

        ConstructorAndMethodOverloading book4 = new ConstructorAndMethodOverloading("DESIGN PATTERNS",
                "ERICH GAMMA",
                49.99);

        // Calling method overloading

        book4.setPrice(45.99, 10);

        // Printing the book details

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();

    }
}