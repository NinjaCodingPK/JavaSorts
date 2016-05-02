package model;

/**
 * Java Quick sort realization.
 * Created by wookie on 5/2/16.
 */
public class QuickSort implements Sorter {
    private double[] array;

    public void sort() {
        doSort(0, array.length-1);
    }

    /**
     * Quick sort algorithm.
     * @param start start index
     * @param end end index
     */
    private void doSort(int start, int end) {
        if (start >= end)
            return;

        int i = start, j = end;
        int supportElem = middleSelection(i, j);
        while (i < j) {
            while ((i < supportElem) && (array[i] <= array[supportElem])) {
                i++;
            }
            while ((j > supportElem) && (array[j] >= array[supportElem])) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                if (i == supportElem)
                    supportElem = j;
                else
                    if (j == supportElem)
                        supportElem = i;
            }
        }

        doSort(start, supportElem);
        doSort(supportElem+1, end);
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

    /**
     * Method returns middle index of array.
     * Method should be used to set value of support element.
     * @param firstIndex first index in array
     * @param lastIndex last index in array
     */
    private int middleSelection(int firstIndex, int lastIndex) {
        return firstIndex - (firstIndex - lastIndex) / 2;
    }

    /**
     * Method returns random index of array.
     * Method should be used to set value of support element.
     * @param firstIndex first index in array
     * @param lastIndex last index in array
     */
    public int randomSelection(int firstIndex, int lastIndex) {
        return firstIndex + (int)(Math.random() * (lastIndex - firstIndex));
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
