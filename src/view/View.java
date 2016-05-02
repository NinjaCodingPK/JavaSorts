package view;

/**
 * Created by wookie on 5/2/16.
 */
public class View {
    // Text's constants
    public static final String INPUT_ARRAY_MESSAGE = "Please input ten double values";
    public static final String INPUT_MESSAGE = "Input double value ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUTPUT_MESSAGE = "Sorted array: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printArray(double[] array) {
        for(double v : array)
            System.out.print(v + " ");

        System.out.println();
    }
}