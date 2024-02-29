package generics.exercicios;

import java.util.List;

public class MaximumFinder<T extends Comparable<T>> {
    public static <T extends Comparable<T>> T findMaximum(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }
}