package oopchallenge.model;

public class Course {
    String name;
    String id;
    int credits;

    public Course(String name, String id, int credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }
    public Course(){
        name = "";
        id = "";
        credits = 0;
    }

    @Override
    public String toString(){
        return """ 
                name: '%s', \
                id: '%s', \
                credits: %d
                """.formatted(name,id,credits);
    }

}
