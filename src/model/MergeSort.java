package model;

/**
 * Java Merge sort realization. Toughness: O(n*log(n)). Require O(n) of additional memory.
 * Stable sort algorithm. Combines well with parallel programming.
 * Algorithm works some for already sorted arrays and non-sorted arrays.
 * Created by wookie on 5/2/16.
 */
public class MergeSort extends Sorter {

    @Override
    public void sort(){
        double temp[] = new double[array.length];
        doSort(this.array , 0 , array.length , temp);
    }

    /**
     * Merge sort algorithm realization.
     * @param array array to sort.
     * @param start start index.
     * @param end end index.
     * @param temp temporary buffer.
     */
    private void doSort(double array[], int start, int end, double temp[]){
        if(start < end - 1) {
            int mid = start + (end - start) / 2;
            doSort(array, start, mid, temp);
            doSort(array, mid, end, temp);
            merge(array, start, mid, end, temp);
        }
    }

    /**
     * merge two parts of one array.
     * @param array to merge.
     * @param start start of first part of array.
     * @param mid middle part of the whole array. End of first part and start of second part.
     * @param end end of second part of array.
     * @param resultArray temporary buffer.
     */
    private void merge(double[] array, int start, int mid, int end, double[] resultArray) {
        int firstIndex = start;
        int secondIndex = mid;
        int resultIndex = 0;

        while((firstIndex < mid) && (secondIndex < end)) {
            if(array[firstIndex] < array[secondIndex]) {
                resultArray[resultIndex] = array[firstIndex];
                resultIndex++;
                firstIndex++;
            } else {
                resultArray[resultIndex] = array[secondIndex];
                resultIndex++;
                secondIndex++;
            }
        }
        while(firstIndex < mid ) {
            resultArray[resultIndex] = array[firstIndex];
            resultIndex++;
            firstIndex++;
        }
        while(secondIndex < end ) {
            resultArray[resultIndex] = array[secondIndex];
            resultIndex++;
            secondIndex++;
        }

        System.arraycopy(resultArray, 0, array, start, resultIndex);
    }
}
