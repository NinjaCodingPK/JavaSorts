package model;

/**
 * an interface for sorters classes.
 * Created by wookie on 5/2/16.
 */
public interface Sorter {
    /**
     * Method which start a sort.
     */
    public void sort();

    /**
     * Method should be used after sorting.
     * @return result array.
     */
    public double[] getArray();

    /**
     *
     * @param array non sorted array.
     */
    public void setArray(double[] array);
}
