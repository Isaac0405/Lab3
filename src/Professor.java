public class Professor extends Person{
    private double salary;
    private String faculty;
    private String subject;

    // Default constructor
    public Professor(){
        super(); // call constructor in superclass
        this.salary = 0.0;
        this.faculty = "";
        this.subject = "";
    }

    // Overloaded constructor
    public Professor(String name, String telephone, String email, double salary, String faculty, String subject) {
        super(name, telephone, email); // call constructor in superclass
        this.salary = salary;
        this.faculty = faculty;
        this.subject = subject;
    }

    // Getters and setters


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Methods
    public void giveLecture() {
        System.out.println("Giving a lecture about OOP");
    }
}
