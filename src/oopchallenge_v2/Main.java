package oopchallenge_v2;


import oopchallenge_v2.model.Student;
import oopchallenge_v2.service.CourseService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        String courseId = "biol_01";
        String courseId2 = "phys_01";
        String courseId3 = "art_01";
        String studentId = "0000";
        String studentId2 = "1111";
        String studentId3= "2222";
        String studentId4= "3333";
        String studentId5 = "4444";

        Student student1 = new Student("jinkai", "yong", 10 ,studentId);
        Student student2 = new Student("james", "bond", 9 ,studentId2);
        Student student3 = new Student("john", "smith", 8 ,studentId3);

        Student[] studentList = {student1,student2,student3};
        courseService.enrollStudents(studentList);



    }
}
