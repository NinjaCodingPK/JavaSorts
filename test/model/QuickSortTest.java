package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wookie on 5/2/16.
 */
public class QuickSortTest {
    private static final double ACCURACY = 1e-10;

    @Test
    public void testSort() {
        double[] array = {1, 9, 2, 3, 6, 5, 4, 8, 7, 0, 1};
        QuickSort qSort = new QuickSort();
        qSort.setArray(array);
        qSort.sort();
        double[] expected = {0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals("Quick sort test ", expected, qSort.getArray(), ACCURACY);
    }
}