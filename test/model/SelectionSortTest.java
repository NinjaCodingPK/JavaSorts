package model;

import org.junit.Test;
import model.SelectionSort;
import static org.junit.Assert.*;

/**
 * Created by wookie on 5/6/16.
 */
public class SelectionSortTest {
    private static final double ACCURACY = 1e-10;

    @Test
    public void testSort() {
        double[] array = {1, 9, 2, 3, 6, 5, 4, 8, 7, 0, 1};
        //double[] array = {1, 0};
        SelectionSort iSort = new SelectionSort();
        iSort.setArray(array);
        iSort.sort();
        double[] expected = {0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //double[] expected = {0, 1};
        assertArrayEquals("Selection sort test ", expected, iSort.getArray(), ACCURACY);
    }
}