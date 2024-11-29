package Project1;

import java.util.ArrayList;
import java.util.List;

public class Student {

	    private String name;
	    private String studentId;
	    private List<String> courses;

	    // Constructor
	    public Student(String name, String studentId) {
	        this.name = name;
	        this.studentId = studentId;
	        this.courses = new ArrayList<>();
	    }

	    // Get student name
	    public String getName() {
	        return name;
	    }

	    // Get student ID
	    public String getStudentId() {
	        return studentId;
	    }

	    // Enroll a student in a course
	    public void enrollInCourse(String course) {
	        courses.add(course);
	    }

	    // View student information
	    public void viewStudentInfo() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Enrolled Courses: ");
	        for (String course : courses) {
	            System.out.println(" - " + course);
	        }
	    }
	}

	
