package Project1;

import java.util.ArrayList;

public class AttendanceManagementSystem {

	    private ArrayList<Student> students;
	    private int totalDays;

	    // Constructor initializes the student list and total days for attendance
	    public AttendanceManagementSystem(int totalDays) {
	        students = new ArrayList<>();
	        this.totalDays = totalDays;
	    }

	    // Add a new student
	    public void addStudent(String name) {
	        students.add(new Student(name, totalDays));
	    }

	    // Mark attendance for a student
	    public void markAttendance(String studentName, int day, String status) {
	        for (Student student : students) {
	            if (student.getName().equalsIgnoreCase(studentName)) {
	                student.markAttendance(day, status);
	                return;
	            }
	        }
	        System.out.println("Student not found!");
	    }

	    // View attendance for all students
	    public void viewAttendance() {
	        if (students.isEmpty()) {
	            System.out.println("No students available.");
	        } else {
	            for (Student student : students) {
	                student.viewAttendance();
	            }
	        }
	    }
	}

	

