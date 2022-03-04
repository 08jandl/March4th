package fh.campus02;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {
        //initialize array
        int[] array = new int[3];
        //fill array
        array[0] = 12;
        array[1] = 56;
        array[2] = 91;

        System.out.println(array);
        System.out.println(Arrays.toString(array));

        //initialize and fill array in one line
        int[] array2 = new int[] {12, 13, 78};
        System.out.println(Arrays.toString(array2));

        // change value at position 2:
        array[2] = 15;
        System.out.println(Arrays.toString(array));

    }


}
