package logicaloperators.grader;

public class Grader {
    int grade;

    public Grader(int grade) {
        this.grade = grade;
    }

    public String showGrade(){

        String feedback = "";

        if (this.grade < 4) feedback = "Failed";
        else if (this.grade < 6) feedback = "Insufficient";
        else if (this.grade < 9) feedback = "Good";
        else if (this.grade <= 10) feedback = "Excellent!";
        else feedback = "Please enter a valid score";
        return feedback;
    }
}
