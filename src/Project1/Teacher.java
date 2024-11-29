package Project1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String teacherId;
    private List<String> courses;

    // Constructor
    public Teacher(String name, String teacherId) {
        this.name = name;
        this.teacherId = teacherId;
        this.courses = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getTeacherId() {
        return teacherId;
    }

    // Assign a course to a teacher
    public void assignCourse(String course) {
        courses.add(course);
    }

    // View teacher information
    public void viewTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Courses Taught: ");
        for (String course : courses) {
            System.out.println(" - " + course);
        }
    }
}
