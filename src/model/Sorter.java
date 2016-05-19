package model;

/**
 * Abstract class for sort classes.
 * Created by wookie on 5/19/16.
 */
public abstract class Sorter {
    protected double[] array;

    /**
     * Method should start sort algorithm.
     */
    public abstract void sort();

    /**
     * Should be called after "sort()" method.
     * @return array of doubles.
     */
    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
