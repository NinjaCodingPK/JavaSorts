package model;

import org.junit.Test;
import model.CombSort;
import static org.junit.Assert.*;

/**
 * Created by wookie on 5/10/16.
 */
public class CombSortTest {
    private static final double ACCURACY = 1e-10;

    @Test
    public void testSort() {
        double[] array = {1, 9, 2, 3, 6, 5, 4, 8, 7, 0, 1};
        CombSort cSort = new CombSort();
        cSort.setArray(array);
        cSort.sort();
        double[] expected = {0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals("Bubble sort test ", expected, cSort.getArray(), ACCURACY);
    }
}