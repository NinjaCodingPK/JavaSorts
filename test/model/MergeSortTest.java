package model;

import org.junit.Test;
import model.MergeSort;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wookie on 5/2/16.
 */
public class MergeSortTest {
    private static final double ACCURACY = 1e-10;

    @Test
    public void testSort() {
        double[] array = {1, 9, 2, 3, 6, 5, 4, 8, 7, 0, 1};
        MergeSort mSort = new MergeSort();
        mSort.setArray(array);
        mSort.sort();
        double[] expected = {0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals("Merge sort test ", expected, mSort.getArray(), ACCURACY);
    }
}