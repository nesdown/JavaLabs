import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class FirstLab {

    private double[][] array;
    private int n;
    private int m;

    FirstLab() throws IOException {
        outName();


        System.out.println("Enter n value: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());

        System.out.println("Enter m value: ");
        m = Integer.parseInt(reader.readLine());

        array = new double[n][n];


        fulfillArray();

        printArray(array);
        shiftArray();
        printArray(array);
    }

    private void fulfillArray() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double toAdd = Math.random() * 10;
                toAdd = Double.parseDouble(new DecimalFormat("#.#").format(toAdd));
                array[i][j] = (toAdd);
            }
        }
    }

    private void printArray(double [][] array) {
        for (double[] anArray : array) {
            for (double anAnArray : anArray) {
                System.out.print(anAnArray + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    private void shiftArrayOnce() {
        double[] temp = array[array.length - 1];

        for(int i = array.length - 1; i > 0; i--){

            array[i] = array[i - 1];   // do the switch

        }

        // do the switch
//        if (array.length - 1 >= 0) System.arraycopy(array, 0, array, 1, array.length - 1);

        array[0] = temp;
    }

    private void shiftArray() {
        for (int i = 0; i < m; i++) shiftArrayOnce();
    }

    private void outName() {
        System.out.println("Hlushko B.S.");
        System.out.println();
    }


}
