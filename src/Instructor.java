public class Instructor extends Student{
    private double salary;
    private String subject;
    public Instructor(){
        super(); // call constructor in superclass
        this.salary = 0.0;
        this.subject = "";
    }
    public Instructor(String name, String telephone, String email, double salary, String subject) {
        super(name, telephone, email); // call constructor in superclass
        this.salary = salary;
        this.subject = subject;
    }
    // Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Methods
    public void attendPractices() {
        System.out.println("Giving a practice about OOP");
    }
}
