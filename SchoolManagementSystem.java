import java.util.ArrayList;
import java.util.Scanner;

// Parent Class
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Student Class
class Student extends Person {
    private String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("--------------------");
    }
}

// Teacher Class
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("--------------------");
    }
}

// Main Class
public class SchoolManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SCHOOL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Teacher");
            System.out.println("4. View Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();

                    System.out.print("Enter Class: ");
                    String cls = sc.nextLine();

                    students.add(new Student(sname, sid, cls));

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Student Records Found.");
                    } else {
                        System.out.println("\n--- Student Records ---");
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Teacher ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Teacher Name: ");
                    String tname = sc.nextLine();

                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();

                    teachers.add(new Teacher(tname, tid, subject));

                    System.out.println("Teacher Added Successfully!");
                    break;

                case 4:
                    if (teachers.isEmpty()) {
                        System.out.println("No Teacher Records Found.");
                    } else {
                        System.out.println("\n--- Teacher Records ---");
                        for (Teacher t : teachers) {
                            t.display();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}