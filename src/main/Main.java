package main;

import model.*;
import view.View;
import controller.Controller;
/**
 * Created by wookie on 5/2/16.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Sorter sort1 = new BubbleSort();
        Sorter sort2 = new CombSort();
        //QuickSort qSort = new QuickSort();
        //MergeSort mSort = new MergeSort();
        Controller controller = new Controller(sort2, view);

        controller.processUser();
    }
}
