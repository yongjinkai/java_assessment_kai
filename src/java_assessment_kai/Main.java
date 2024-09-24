package java_assessment_kai;

import java_assessment_kai.model.Course;
import java_assessment_kai.model.Student;
import java_assessment_kai.service.CourseService;
import java_assessment_kai.service.StudentService;
import java_assessment_kai.utils.PrinterHelper;

import java.text.ParseException;
import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
            throws ParseException
    {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        Scanner scanner = new Scanner( System.in );
        int option = 0;
        do
        {
            PrinterHelper.showMainMenu();
            option = scanner.nextInt();
            switch ( option )
            {
                case 1:
                    registerStudent( studentService, scanner );
                    break;
                case 2:
                    findStudent( studentService, scanner );
                    break;
                case 3:
                    gradeStudent( studentService, scanner );
                    break;
                case 4:
                    enrollStudentToCourse( studentService, courseService, scanner );
                    break;
                case 5:
                    showStudentsSummary( studentService, scanner );
                    break;
                case 6:
                    showCoursesSummary( courseService, scanner );
                    break;
                case 7:
                    getAverage(studentService,scanner);
                    break;
            }
        }
        while ( option != 8 );
    }

    private static void enrollStudentToCourse( StudentService studentService, CourseService courseService,
                                               Scanner scanner )
    {
        System.out.println( "Insert student ID" );
        String studentId = scanner.next().toLowerCase();
        Student student = studentService.findStudent( studentId );
        if ( student == null )
        {
            System.out.println( "Invalid Student ID" );
            return;
        }
        System.out.println( student );
        System.out.println( "Insert course ID" );
        String courseId = scanner.next().toUpperCase();
        Course course = courseService.getCourse( courseId );
        if ( course == null )
        {
            System.out.println( "Invalid Course ID" );
            return;
        }
        System.out.println( course );
        courseService.enrollStudent( courseId, student );
        studentService.enrollToCourse( studentId, course );
        System.out.println( "Student with ID: " + studentId + " enrolled successfully to " + courseId );

    }

    private static void showCoursesSummary( CourseService courseService, Scanner scanner )
    {
        courseService.showSummary();
    }

    private static void showStudentsSummary( StudentService studentService, Scanner scanner )
    {
        studentService.showSummary();
    }

    private static void gradeStudent( StudentService studentService, Scanner scanner )
    {
        System.out.print( "Enter student ID: " );
        String studentId = scanner.next().toLowerCase();
        Student student = studentService.findStudent( studentId );
        if(student.getEnrolledCourses().isEmpty()){
            System.out.println("No courses to grade.");
            return;
        }

        System.out.println("Enter a course from below to grade: ");
        for (Course course : student.getEnrolledCourses()){
            System.out.println(course.getId());
        }
        String courseId = scanner.next().toUpperCase();


        System.out.print("Enter grade (0-5): ");
        int grade = scanner.nextInt();

        if (grade>5 || grade <0) {
            System.out.println("Invalid grade");
            return;
        }
        student.setStudentCourseGrade(courseId,grade);

    }

    private static void findStudent( StudentService studentService, Scanner scanner )
    {
        System.out.println( "Enter student ID: " );
        String studentId = scanner.next();
        Student student = studentService.findStudent( studentId );
        if ( student != null )
        {
            System.out.println( "Student Found: " );
            System.out.println( student );
        }
        else
        {
            System.out.println( "Student with Id = " + studentId + " not found" );
        }
    }

    private static void registerStudent( StudentService studentService, Scanner scanner )
            throws ParseException
    {
        Student student = PrinterHelper.createStudentMenu( scanner );
        studentService.subscribeStudent( student );
    }

    private static void getAverage(StudentService studentService,Scanner scanner){
        System.out.print("Enter course ID: ");
        String courseId = scanner.next().toUpperCase();
        studentService.showAverage(courseId);
    }

}
