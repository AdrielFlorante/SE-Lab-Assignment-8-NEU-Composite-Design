import java.util.ArrayList;
import java.util.List;

public class College implements OrganizationalUnit {
    private String name;
    private List<OrganizationalUnit> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(OrganizationalUnit component) {
        components.add(component);
    }

    public void remove(OrganizationalUnit component) {
        components.remove(component);
    }

    public List<OrganizationalUnit> getChildren() {
        return components;
    }

    @Override
    public void displayDetails() {
        System.out.println("College Name: " + this.name);
        System.out.println("Number of Students: " + getNumberOfStudents());
    }

    @Override
    public void getTeachers() {
        System.out.println("List of Teachers: ");
        for (OrganizationalUnit component : components) {
            if (component instanceof Teacher) {
                component.displayDetails();
            }
        }
    }

    @Override
    public double calculateBudget() {
        double budget = 0;
        for (OrganizationalUnit component : components) {
            budget += component.calculateBudget();
        }
        return budget;

        // The budget consists of the department's teachers salary and its students' tuition
    }

    @Override
    public int getNumberOfStudents() {
        int noOfStudents = 0;
        for (OrganizationalUnit component : components) {
            noOfStudents += component.getNumberOfStudents();
        }
        return noOfStudents;
    }
}
