package java_assessment_kai.model;

import java.util.List;

public interface Evaluation                 // business rules for any entities that require Eval. methods here
{
    double getAverage();                    // method signature

    List<Course> getApprovedCourses();      // method signature

}