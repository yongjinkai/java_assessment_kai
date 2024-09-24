package setscollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCollection3 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        Integer[] arrListA = {1,2,3,4};
        Integer[] arrListB = {3,4,5,6};

        setA.addAll(Arrays.asList(arrListA));
        setB.addAll(Arrays.asList(arrListB));

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        Set<Integer> intersect = new HashSet<>(setA);
        intersect.retainAll(setB);
        System.out.println(intersect);

        Set<Integer> difference = new HashSet<>(union);
        difference.removeAll(intersect);
        System.out.println(difference);

    }
}
