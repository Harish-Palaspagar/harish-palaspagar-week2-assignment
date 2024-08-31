class PersonInfo {

    // Fields declaration

    private String firstname;
    private String lastname;
    private String city;
    private String state;
    private String country;
    private String email;
    private int age;

    // Constructor parameters

    public PersonInfo(String firstname, String lastname, String city, String state, String country, String email,
            int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.state = state;
        this.country = country;
        this.email = email;
        this.age = age;
    }

    // Constructor without parameters

    public PersonInfo() {

    }

    // Setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Setter with validation

    public void setAge(int age) {
        if (age == 0) {
            System.out.println("AGE CANNOT BE ZERO");
        } else {
            this.age = age;
        }
    }

    // Method to display details

    public void display() {
        System.out.println("FIRSTNAME : " + firstname);
        System.out.println("LASTNAME : " + lastname);
        System.out.println("CITY : " + city);
        System.out.println("STATE : " + state);
        System.out.println("COUNTRY : " + country);
        System.out.println("EMAIL : " + email);
        System.out.println("AGE : " + age);
    }

}

public class Person {

    // Main method

    public static void main(String[] args) {

        // Creating an object of the class

        PersonInfo person1 = new PersonInfo("HARISH",
                "PALASPAGAR",
                "CHANDUR BAZAR",
                "MAHARASTRA",
                "INDIA",
                "HARISH@GMAIL.COM",
                23);

        // Creating an object of the class

        PersonInfo person2 = new PersonInfo();
        person2.setFirstname("RAHUL");
        person2.setLastname("KUMAR");
        person2.setCity("PATNA");
        person2.setState("BIAHR");
        person2.setCountry("INDIA");
        person2.setEmail("RAGUL@GMAIL.COM");
        person2.setAge(25);

        // Calling the method to display details

        person1.display();

        System.out.println();

        // Calling the method to display details

        person2.display();

    }
}
