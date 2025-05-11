public class Teacher implements OrganizationalUnit {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher's Name: " + this.name);
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher's Budget: " + this.salary);
    }

    @Override
    public void getTeachers() {
        displayDetails();
    }

    @Override
    public double calculateBudget() {
        return this.salary;
    }

    @Override
    public int getNumberOfStudents() {
        return 0; // Teacher is not a student, obviously
    }
}
