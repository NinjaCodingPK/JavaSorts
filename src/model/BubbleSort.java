package model;

/**
 * Java bubble sort realization. Toughness: O(n*n).
 * Stable sort algorithm. One of the slowest algorithms. Works good only for small arrays.
 * Created by wookie on 5/5/16.
 */
public class BubbleSort extends Sorter {

    @Override
    public void sort() {
        doSort();
    }

    /**
     * Bubble sort algorithm realization.
     */
    private void doSort() {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    /**
     * swap two elements of array.
     * @param index1 first index of array
     * @param index2 second index of array
     */
    private void swap(int index1, int index2) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
