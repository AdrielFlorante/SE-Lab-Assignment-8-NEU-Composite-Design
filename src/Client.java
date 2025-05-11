public class Client {
    public static void main(String[] args) {
        // Students with ID, Name, Tuition
        Student student1 = new Student("Alice", "S001", 20000);
        Student student2 = new Student("Bob", "S002", 18000);
        Student student3 = new Student("Jane", "S003", 19000);
        Student student4 = new Student("Mike", "S004", 21000);
        Student student5 = new Student("Eve", "S005", 19500);
        Student student6 = new Student("John", "S006", 20500);
        Student student7 = new Student("Lara", "S007", 20000);
        Student student8 = new Student("Sam", "S008", 18500);
        Student student9 = new Student("Nina", "S009", 19500);

        // Teachers with Name, Subject, Salary
        Teacher teacher1 = new Teacher("Dr. Smith", "Algorithms", 70000);
        Teacher teacher2 = new Teacher("Prof. Johnson", "Data Structures", 65000);
        Teacher teacher3 = new Teacher("Ms. Lee", "Calculus", 60000);
        Teacher teacher4 = new Teacher("Mr. Tan", "Networking", 62000);
        Teacher teacher5 = new Teacher("Mrs. Cruz", "Digital Logic", 64000);
        Teacher teacher6 = new Teacher("Engr. Santos", "Database Systems", 63000);

        // Departments under College of Engineering
        Department csDepartment = new Department("Computer Science");
        csDepartment.add(student1);
        csDepartment.add(student2);
        csDepartment.add(teacher1);
        csDepartment.add(teacher2);

        Department mathDepartment = new Department("Mathematics");
        mathDepartment.add(student3);
        mathDepartment.add(student4);
        mathDepartment.add(teacher3);

        // College of Engineering
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.add(csDepartment);
        engineeringCollege.add(mathDepartment);

        // Departments under CICS
        Department itDepartment = new Department("Information Technology");
        itDepartment.add(student5);
        itDepartment.add(teacher4);

        Department compEngDepartment = new Department("Computer Engineering");
        compEngDepartment.add(student6);
        compEngDepartment.add(student7);
        compEngDepartment.add(teacher5);

        Department infoSysDepartment = new Department("Information Systems");
        infoSysDepartment.add(student8);
        infoSysDepartment.add(student9);
        infoSysDepartment.add(teacher6);

        // College of Information and Computing Sciences
        College cicsCollege = new College("College of Information and Computing Sciences");
        cicsCollege.add(itDepartment);
        cicsCollege.add(compEngDepartment);
        cicsCollege.add(infoSysDepartment);

        // Display details for both colleges
        System.out.println("\n * College of Engineering");
        engineeringCollege.displayDetails();
        System.out.println("Total Budget: $" + engineeringCollege.calculateBudget());
        System.out.println("Total Students: " + engineeringCollege.getNumberOfStudents());

        System.out.println("\n * College of Information and Computing Sciences");
        cicsCollege.displayDetails();
        System.out.println("Total Budget: $" + cicsCollege.calculateBudget());
        System.out.println("Total Students: " + cicsCollege.getNumberOfStudents());

        // Print teachers in Math Department
        System.out.println("\n * Math Department Teachers");
        mathDepartment.getTeachers();

        System.out.println("\n * IT Department Teachers");
        itDepartment.getTeachers();

        System.out.println("\n * IS Department Teachers");
        infoSysDepartment.getTeachers();
    }
}
