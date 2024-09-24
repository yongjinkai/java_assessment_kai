package oopchallenge;

import oopchallenge.model.Course;
import oopchallenge.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(001,1,2,true,"Yong","JinKai");
        Course java = new Course("Java","J1101",4);
        Course html = new Course("HTML","H2101",4);
        student1.enrollCourse(java);
        student1.enrollCourse(html);
        System.out.println(student1.totalEnrolledCourses());
        student1.unenrollCourse(java);
        System.out.println(student1);
    }
}
