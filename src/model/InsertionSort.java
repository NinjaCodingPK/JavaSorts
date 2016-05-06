package model;

/**
 * Java Insertion sort realization. Toughness: O(n*n).
 * Stable sort algorithm. One of the best algorithms for small arrays.
 * Created by wookie on 5/6/16.
 */
public class InsertionSort implements Sorter {
    private double[] array;

    @Override
    public void sort() {
        doSort();
    }

    /**
     * Insertion sort algorithm.
     */
    private void doSort() {
        int j;
        double temp;

        for(int i = 1; i < array.length; i++)
        {
            temp = array[i];
            for(j = i - 1; j >= 0; j--)
            {
                if (array[j] < temp)
                    break;

                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }

    @Override
    public double[] getArray() {
        return array;
    }

    @Override
    public void setArray(double[] array) {
        this.array = array;
    }
}
