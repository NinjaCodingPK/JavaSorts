package main;

import model.QuickSort;
import view.View;
import controller.Controller;
/**
 * Created by wookie on 5/2/16.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        QuickSort qsort = new QuickSort();
        Controller controller = new Controller(qsort, view);

        controller.processUser();
    }
}
