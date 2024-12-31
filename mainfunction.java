import java.util.ArrayList;

public class mainfunction {
    public static void main(String[] args) {
        ArrayList<person> people = new ArrayList<>();

        // Add Students
        student student1 = new student(1, "John Doe", 16, "123 Street", "10th Grade", "S101");
        student student2 = new student(2, "Jane Smith", 17, "456 Street", "11th Grade", "S102");
        people.add(student1);
        people.add(student2);
    
        // Add Teachers
        teacher teacher1 = new teacher(3, "Mr. Wilson", 35, "789 Street", "Mathematics", 50000);
        teacher teacher2 = new teacher(4, "Ms. Taylor", 29, "321 Street", "English", 48000);
        people.add(teacher1);
        people.add(teacher2);
    
        // Add Admin Staff
        adminstaff admin1 = new adminstaff(5, "Anna Johnson", 40, "654 Street", "Finance", "Accountant");
        adminstaff admin2 = new adminstaff(6, "Paul Brown", 45, "987 Street", "HR", "HR Manager");
        people.add(admin1);
        people.add(admin2);
    
        // Perform actions
        System.out.println("School Management System:");
    
        student1.calculateGrade(85);
        teacher1.assignTimetable("Mon-Wed: 9 AM to 12 PM");
        admin1.assignTask("Prepare monthly financial report");
    
        for (person person : people) {
            person.display();
            System.out.println("======================================================================");
        }
    
        // Manage leaves
        student1.applyLeave(2);
        teacher1.applyLeave(5);
        admin2.applyLeave(12); // Should fail due to insufficient balance
    }
        // ArrayList<person> people ArrayList<person>
    }

