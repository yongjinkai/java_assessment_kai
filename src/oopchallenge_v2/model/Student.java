package oopchallenge_v2.model;

import java_assessment_kai.model.Course;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    boolean registration;
    int grade;
    int year = 1 ;
    String id;
    ArrayList <Course> enrolledCourses = new ArrayList<>();

    public Student(String id, int year, int grade, boolean registration, String lastName, String firstName) {
        this.id = id;
        this.year = year;
        this.grade = grade;
        this.registration = registration;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student(String firstNames, String lastName, boolean registration, int grade, int year, String id) { //OVERLOADED
        firstName = firstNames;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
        this.id = id;
        this.registration=true;
    }

    public Student(String firstName, String lastName, int grade, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = id;
    }

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.registration = false;
        this.grade = 0;
        this.year = 1;
        this.id = "";
        this.enrolledCourses = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void printFullName(){
        System.out.println(this.firstName+" "+this.lastName);
    }

    public boolean enrollCourse(Course course){
        return enrolledCourses.add(course);
    }

    public int totalEnrolledCourses(){
        return enrolledCourses.size();
    }

    public boolean unenrollCourse(Course course){
        return enrolledCourses.remove(course);
    }

    public ArrayList<Course> getEnrolledCourses(){
        return enrolledCourses;
    }

    @Override
    public String toString() {
        return """
                Student{firstName='%s', lastName='%s', grade='%d', year='%d', id=%s, courses=%s}
                """
                .formatted(firstName, lastName, grade, year, id,enrolledCourses);
    }

}
