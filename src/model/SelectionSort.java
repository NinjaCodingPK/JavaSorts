package model;

/**
 * Java Selection sort realization. Toughness: O(n*n).
 * Non-stable sort algorithm. Works good in big arrays with small keys.
 * Toughness of algorithm don't depends on state of array.
 * Created by wookie on 5/6/16.
 */
public class SelectionSort extends Sorter {

    @Override
    public void sort() {
        doSort();
    }

    /**
     * Selection sort algorithm.
     */
    private void doSort() {
        int minPos;

        for(int i = 0; i < array.length; i++) {
            minPos = findMinPosition(i);
            if(i != minPos) {
                swap(i, minPos);
            }

        }
    }

    /**
     * Find position of min element in array.
     * Min element is searched from startPos to the end of array.
     * @param startPos start position of searching.
     * @return position of min element.
     */
    private int findMinPosition(int startPos) {
        int minPos = startPos;

        for(int i = startPos + 1; i < array.length; i++) {
            if(array[i] < array[minPos])
                minPos = i;
        }

        return minPos;
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
