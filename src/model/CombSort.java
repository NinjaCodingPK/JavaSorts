package model;

/**
 * Java comb sort algorithm realization. Modified bubble sort. Toughness: O(n*log(n)).
 * Created by wookie on 5/10/16.
 */
public class CombSort extends Sorter {
    private static final double DECREASE = 1.247;

    @Override
    public void sort() {
        doSort();
    }

    /**
     * Comb sort algorithm.
     */
    private void doSort() {
        double step = array.length/2;

        while(step > 1) {
            for(int i = 0; i < array.length - step; i++) {
                if(array[i] > array[i+(int)step])
                    swap(i, i + (int)step);
            }

            step -= DECREASE;
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
