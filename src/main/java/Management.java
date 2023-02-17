import java.util.Arrays;
import java.util.Scanner;

public class Management {
    private Data data;
    public void management(Menu menu, Data data) {
        this.data = data;
        int opt;
        do {
            System.out.println(menu.getMenu());
            opt = readOpt();
            execute(opt);
        } while (opt != menu.optionExit());
    }
    private void execute(int opt){
        switch (opt) {
            case 1:
                data.initA();
                System.out.println("Array a uploaded");
                break;
            case 2:
                data.initB();
                System.out.println("Array b uploaded");
               break;
            case 3:
                printArray(data.getDataA());
                break;
            case 4:
                printArray(data.getDataB());
                break;
            case 5:
                if (data.isEmptyA() || data.isEmptyB()) {
                    System.out.println("One array is empty");
                } else {
                    Integer[] sum = data.sum();
                    System.out.println("Showing sum array a + b:" );
                    printArray(sum);
                }
                break;
            case 6:
                if (data.isEmptyA() || data.isEmptyB()) {
                    System.out.println("One array is empty");
                } else {
                    Integer[] multiply = data.multiply();
                    System.out.println("Showing multipication array a * b:");
                    printArray(multiply);
                }
                break;
            case 7:
                if (data.isEmptyA()) {
                    System.out.println("The array is empty");
                }else {
                    Integer[] reverse = data.reverse();
                    System.out.println("Showing reverse content array a:");
                    printArray(reverse);
                }
                break;
            case 8:
                System.out.println("Finishing program");
                break;
        }
    }

    private void printArray(Integer[] data) {
        if (data == null) {
            System.out.println("One or various arrays are empty");
        } else {
            System.out.println(Arrays.toString(data));
        }
    }

    private int readOpt(){
        return new Scanner(System.in).nextInt();
    }
}
