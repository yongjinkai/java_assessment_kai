package variables;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        double d = 100.3;

//        Explicitly typecast the value in d to long before assignment
        long l = (long) d;

        int i = (int) l;

        Long lng = 100L;


        System.out.println(i);
    }
}
