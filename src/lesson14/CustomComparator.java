package lesson14;

import java.util.Comparator;

public class CustomComparator<T extends Number> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.intValue(), o2.intValue());
    }
}
