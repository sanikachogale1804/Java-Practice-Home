package Project1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	    private String name;
	    private List<String> attendance;  // List to store "Present" or "Absent"

	    // Constructor initializes the student's name and creates an empty list for attendance
	    public Student(String name, int totalDays) {
	        this.name = name;
	        this.attendance = new ArrayList<>(totalDays);
	        // Initialize attendance with "Absent" by default
	        for (int i = 0; i < totalDays; i++) {
	            this.attendance.add("Absent");
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    // Mark attendance for a particular day (0-based index)
	    public void markAttendance(int day, String status) {
	        if (day >= 0 && day < attendance.size()) {
	            attendance.set(day, status);
	        } else {
	            System.out.println("Invalid day index.");
	        }
	    }

	    // View attendance for the student
	    public void viewAttendance() {
	        System.out.print(name + ": ");
	        for (String status : attendance) {
	            System.out.print(status + " ");
	        }
	        System.out.println();
	    }
	}



