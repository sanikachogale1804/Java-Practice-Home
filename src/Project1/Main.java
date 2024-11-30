package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        courses.add(new Course("FSD java", "C101"));
        courses.add(new Course("FSD python", "C102"));
        courses.add(new Course("Data Science", "C103"));

        teachers.add(new Teacher("Priyanka Vibhute", "T001"));
        teachers.add(new Teacher("Suresh pawar", "T002"));

        students.add(new Student("Sneha", "S001"));
        students.add(new Student("Tushar", "S002"));

        int choice;
        while (true) {
            System.out.println("School Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Course");
            System.out.println("4. Assign Course to Student");
            System.out.println("5. Assign Course to Teacher");
            System.out.println("6. View Student Info");
            System.out.println("7. View Teacher Info");
            System.out.println("8. View All Courses");
            System.out.println("9. Exit");
            System.out.print("Enter your choice (1-9): ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    students.add(new Student(studentName, studentId));
                    break;

                case 2:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter teacher ID: ");
                    String teacherId = scanner.nextLine();
                    teachers.add(new Teacher(teacherName, teacherId));
                    break;

                case 3:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.nextLine();
                    courses.add(new Course(courseName, courseCode));
                    break;

                case 4:
                    System.out.print("Enter student ID: ");
                    studentId = scanner.nextLine();
                    System.out.print("Enter course name to assign: ");
                    courseName = scanner.nextLine();

                    boolean studentFound = false;
                    for (Student student : students) {
                        if (student.getStudentId().equals(studentId)) {
                            student.enrollInCourse(courseName);
                            studentFound = true;
                            break;
                        }
                    }
                    if (!studentFound) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    // Assign Course to Teacher
                    System.out.print("Enter teacher ID: ");
                    teacherId = scanner.nextLine();
                    System.out.print("Enter course name to assign: ");
                    courseName = scanner.nextLine();

                    // Find the teacher and assign the course
                    boolean teacherFound = false;
                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId().equals(teacherId)) {
                            teacher.assignCourse(courseName);
                            teacherFound = true;
                            break;
                        }
                    }
                    if (!teacherFound) {
                        System.out.println("Teacher not found!");
                    }
                    break;

                case 6:
                    // View Student Info
                    System.out.print("Enter student ID to view: ");
                    studentId = scanner.nextLine();

                    // Find the student and display their info
                    boolean foundStudent = false;
                    for (Student student : students) {
                        if (student.getStudentId().equals(studentId)) {
                            student.viewStudentInfo();
                            foundStudent = true;
                            break;
                        }
                    }
                    if (!foundStudent) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 7:
                    // View Teacher Info
                    System.out.print("Enter teacher ID to view: ");
                    teacherId = scanner.nextLine();

                    // Find the teacher and display their info
                    boolean foundTeacher = false;
                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId().equals(teacherId)) {
                            teacher.viewTeacherInfo();
                            foundTeacher = true;
                            break;
                        }
                    }
                    if (!foundTeacher) {
                        System.out.println("Teacher not found!");
                    }
                    break;

                case 8:
                    // View All Courses
                    if (courses.isEmpty()) {
                        System.out.println("No courses available.");
                    } else {
                        System.out.println("All Courses:");
                        for (Course course : courses) {
                            course.viewCourseInfo();
                        }
                    }
                    break;

                case 9:
                    // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 9.");
                    break;
            }
        }
    }
}


