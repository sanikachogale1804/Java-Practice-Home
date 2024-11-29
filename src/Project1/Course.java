package Project1;

public class Course {
	
	    private String courseName;
	    private String courseCode;

	    // Constructor
	    public Course(String courseName, String courseCode) {
	        this.courseName = courseName;
	        this.courseCode = courseCode;
	    }

	    // Get course name
	    public String getCourseName() {
	        return courseName;
	    }

	    // Get course code
	    public String getCourseCode() {
	        return courseCode;
	    }

	    // View course information
	    public void viewCourseInfo() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Course Code: " + courseCode);
	    }
	}



