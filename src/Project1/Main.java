package Project1;

import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of days for attendance: ");
	        int totalDays = scanner.nextInt();
	        scanner.nextLine();  

	        AttendanceManagementSystem system = new AttendanceManagementSystem(totalDays);

	        while (true) {
	            System.out.println("\nAttendance Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. Mark Attendance");
	            System.out.println("3. View Attendance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume the newline character

	            switch (choice) {
	                case 1:
	                    // Add Student
	                    System.out.print("Enter student's name: ");
	                    String name = scanner.nextLine();
	                    system.addStudent(name);
	                    System.out.println("Student added successfully.");
	                    break;

	                case 2:
	                    // Mark Attendance
	                    System.out.print("Enter student's name: ");
	                    String studentName = scanner.nextLine();
	                    System.out.print("Enter day (1 to " + totalDays + "): ");
	                    int day = scanner.nextInt() - 1;  // Subtract 1 to make it zero-indexed
	                    scanner.nextLine();  // Consume the newline character
	                    System.out.print("Enter attendance status (Present/Absent): ");
	                    String status = scanner.nextLine();
	                    system.markAttendance(studentName, day, status);
	                    break;

	                case 3:
	                    // View Attendance
	                    system.viewAttendance();
	                    break;

	                case 4:
	                    // Exit
	                    System.out.println("Exiting the system. Goodbye!");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }
	}


}
