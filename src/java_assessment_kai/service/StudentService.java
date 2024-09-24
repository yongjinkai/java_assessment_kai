package java_assessment_kai.service;


import java_assessment_kai.model.Course;
import java_assessment_kai.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public StudentService() {
        subscribeStudent( new Student( "Adrian", "Tan", "adriantan@gmail.com", new Date(101,0,17),"stu01"));     // 2001 Jan 17
        subscribeStudent( new Student( "Goh", "Hui Xin", "gohhuixin@hotmail.com", new Date(102,8,4), "stu02") ); // 2002 Sep 4
        subscribeStudent( new Student( "Alex", "Lim", "alexlim@gmail.com", new Date(103,4,30), "stu03") );       // 2003 May 30
    }

    public void subscribeStudent( Student student ) {
        students.put( student.getId(), student );
    }


    public Student findStudent(String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public boolean isSubscribed( String studentId )
    {
        //TODO implement this method
        return students.containsKey(studentId);
    }

    public void showSummary()
    {
        //TODO implement
        //TODO 1. display a title for this feature
        //TODO 2. list each student AND the course(s) the student is enrolled into approvedCourses
        System.out.println("Students and the courses enrolled into");
        for (String key: students.keySet()){
            Student student = students.get(key);
            student.printFullName();

            List<Course> courses = student.getApprovedCourses();

            if(courses == null) {
                System.out.println("\t\t No Course Found.");
            }else{
                for(Course course: courses){
                    System.out.println("\t" + course);
                    String courseId = course.getId();
                    if (student.getStudentCourseGrades().containsKey(courseId)){
                        System.out.println("\tCourse grade: " + student.getStudentCourseGrades().get(courseId) + "\n");
                    }
                }
            }
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            Student student = students.get(studentId);
            student.enrollToCourse( course );
        }
    }

    public void showAverage(String courseId){
        ArrayList<Integer> courseGrades = new ArrayList<>();
        students.forEach((stuId,student)->{
            if (student.getStudentCourseGrades().containsKey(courseId))
                courseGrades.add(student.getStudentCourseGrades().get(courseId));
        });
        if(courseGrades.isEmpty()){
            System.out.println("No grades found for " + courseId);
        }else {
            int sum = 0;
            double avg = 0;
            for (int grade : courseGrades){
                sum += grade;
            }
            avg = (double) sum/courseGrades.size();
            System.out.println("The average grade is " + avg);
        }
    }
}
