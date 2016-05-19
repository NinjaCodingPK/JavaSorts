package model;

/**
 * Java Shell's sort algorithm realization. Toughness: O(n*log^2(n)).
 * Non-stable sort algorithm. In general works slower than "Quick sort" algorithm,
 * but it don't need additional memory and it works better with "bad" input arrays.
 * Created by wookie on 5/10/16.
 */
public class ShellSort extends Sorter {

    @Override
    public void sort() {
        doSort();
    }

    /**
     * Shell's sort algorithm.
     */
    private void doSort() {
        int intervalLength;

        for(intervalLength = array.length/2; intervalLength > 0; intervalLength /= 2) {
            for(int i = 0; i < array.length - intervalLength; i++) {
                for(int j = 0; j < array.length-intervalLength; j++) {
                    if(array[j] > array[intervalLength+j])
                        swap(j, intervalLength+j);
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
