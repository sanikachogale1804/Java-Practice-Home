package Project1;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	    private List<Student> students;
	    private List<Teacher> teachers;
	    private List<Course> courses;

	    // Constructor initializes the lists
	    public School() {
	        students = new ArrayList<>();
	        teachers = new ArrayList<>();
	        courses = new ArrayList<>();
	    }

	    // Add a new student
	    public void addStudent(String name, String studentId) {
	        students.add(new Student(name, studentId));
	    }

	    // Add a new teacher
	    public void addTeacher(String name, String teacherId) {
	        teachers.add(new Teacher(name, teacherId));
	    }

	    // Add a new course
	    public void addCourse(String courseName, String courseCode) {
	        courses.add(new Course(courseName, courseCode));
	    }

	    // Assign a course to a student
	    public void assignCourseToStudent(String studentId, String courseName) {
	        for (Student student : students) {
	            if (student.getStudentId().equals(studentId)) {
	                student.enrollInCourse(courseName);
	                return;
	            }
	        }
	        System.out.println("Student not found!");
	    }

	    // Assign a course to a teacher
	    public void assignCourseToTeacher(String teacherId, String courseName) {
	        for (Teacher teacher : teachers) {
	            if (teacher.getTeacherId().equals(teacherId)) {
	                teacher.assignCourse(courseName);
	                return;
	            }
	        }
	        System.out.println("Teacher not found!");
	    }

	    // View student details
	    public void viewStudentInfo(String studentId) {
	        for (Student student : students) {
	            if (student.getStudentId().equals(studentId)) {
	                student.viewStudentInfo();
	                return;
	            }
	        }
	        System.out.println("Student not found!");
	    }

	    // View teacher details
	    public void viewTeacherInfo(String teacherId) {
	        for (Teacher teacher : teachers) {
	            if (teacher.getTeacherId().equals(teacherId)) {
	                teacher.viewTeacherInfo();
	                return;
	            }
	        }
	        System.out.println("Teacher not found!");
	    }

	    // View all courses
	    public void viewAllCourses() {
	        if (courses.isEmpty()) {
	            System.out.println("No courses available.");
	            return;
	        }
	        for (Course course : courses) {
	            course.viewCourseInfo();
	        }
	    }


}
