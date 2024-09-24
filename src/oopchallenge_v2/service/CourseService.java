package oopchallenge_v2.service;

import java_assessment_kai.model.Course;
import oopchallenge_v2.model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseService {
    HashMap<String,Student> students = new HashMap<>();
    HashMap<String,Course> courses = new HashMap<>();
    static int year = 2024;

    public CourseService() {
    // create a new HashMap of Students upon instantiating CourseService
    students.put("120120", new Student("Santiago", "Andres", 10 ,"120120"));
    students.put( "884545", new Student( "Kate", "Smith", 50 ,"884545" ));
    students.put( "458787", new Student( "Alejandra", "Thomas", 5, "458787" ));
    students.put( "135464", new Student( "Maria", "Simpson", 99 ,"135464" ));
    students.put( "778979", new Student( "Peter", "Thomas", true, 0, 2,"778979" ));

    // create new HashMap of Courses upon instantiating CourseService
    courses.put("math_01", new Course("Mathematics 1", "math_01", 8));
    courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
    courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
    courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
    courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
    courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }

    public void enrollStudents(Student[] studentList){
        //TODO add all the students to the collection
//        System.out.println(students);
        for (Student student:studentList){
            students.put(student.getId(),student);
        }
        students.forEach((id,student)-> System.out.println(student.getFirstName()));
    }

    public boolean enrollStudent(String studentId,String courseId){
        Student student = students.get(studentId);
        if (student == null){
            System.out.println("student not found");
            return false;
        }

        return student.enrollCourse(courses.get(courseId));
    }

    public boolean unenrollStudents(String studentId,String courseId){
        //TODO 1. obtain student by its id and course by its id
        //TODO 2. unenroll a student
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        return student.unenrollCourse(course);
    }

    public void displayCourseInfo(String courseId){
        System.out.println(courses.get(courseId));
    }

    public void displayStudentInfo(String studentId){
        System.out.println(students.get(studentId));
    }

    public Student getStudent(String studentId){
        return students.get(studentId);
    }

    public void displayStudentCourseInfo(String studentId){
        Student student = students.get(studentId);
        if (student == null){
            System.out.println("student not found");
            return;
        }
        System.out.println(student.getEnrolledCourses());

    }



    public void displayStudentEnrollments(String courseId){
        ArrayList<Student> enrolledStudents = new ArrayList<>();
        String enquiredCourse = courses.get(courseId).getName();
        students.forEach((studentId,student)->{
            ArrayList<Course> enrolledCourses = student.getEnrolledCourses();
            for (Course course : enrolledCourses){
                if (course.getId() == courseId){
                    enrolledStudents.add(student);
                }
            }
        });
        System.out.println("Enrolled students for " + enquiredCourse);
        for (Student student: enrolledStudents){
            System.out.println(student.getFirstName() +" "+ student.getLastName());
        }

    }

    public static void PrintYearIncorporated(){
        System.out.println(year);
    }

}