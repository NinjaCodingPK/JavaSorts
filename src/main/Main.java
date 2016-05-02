package main;

import model.MergeSort;
import model.QuickSort;
import view.View;
import controller.Controller;
/**
 * Created by wookie on 5/2/16.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        QuickSort qSort = new QuickSort();
        MergeSort mSort = new MergeSort();
        Controller controller = new Controller(mSort, view);

        controller.processUser();
    }
}
