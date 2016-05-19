package model;

/**
 * Created by wookie on 5/19/16.
 */
public abstract class Sorter {
    private double[] array;

    public abstract void sort();

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
