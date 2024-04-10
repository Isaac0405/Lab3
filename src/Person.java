public class Person {
    private String name;
    private String telephone;
    private String email;

    // Default constructor
    public Person() {
        this.name = "";
        this.telephone = "";
        this.email = "";
    }

    // Overloaded constructor
    public Person(String name, String telephone, String email) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    public String getTelephone(){
        return telephone;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methods of a person
    public void enterUniversity() {
        System.out.println("Entering University");
    }

    public void purchaseParkingPass() {
        System.out.println("Purchasing a parking pass");
    }
}