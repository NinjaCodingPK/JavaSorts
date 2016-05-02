package controller;

import java.util.Scanner;
import view.View;
import model.Sorter;

/**
 * Created by wookie on 5/2/16.
 */
public class Controller {
    private Sorter model;
    private View view;

    public Controller(Sorter model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        double[] array = inputArray(sc);
        model.setArray(array);
        model.sort();

        view.printMessage(View.OUTPUT_MESSAGE);
        view.printArray(model.getArray());
    }


    private double inputProperDoubleValue(Scanner sc) {
        view.printMessage(View.INPUT_MESSAGE);
        while( ! sc.hasNextDouble()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_MESSAGE);
            sc.next();
        }
        return sc.nextDouble();
    }

    private double[] inputArray(Scanner sc) {
        double[] numbers = new double[10];

        view.printMessage(View.INPUT_ARRAY_MESSAGE);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = inputProperDoubleValue(sc);
        }

        return numbers;
    }
}
