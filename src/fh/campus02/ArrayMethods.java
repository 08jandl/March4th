package fh.campus02;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] schachtel = new int[]{3, 5, 7, 11, 13, 17};

        printArray(schachtel);
        System.out.println(containsNumber(3, schachtel));
        System.out.println(containsNumberWrong(17, schachtel));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static boolean containsNumberWrong(int number, int[] array) {
        boolean isContained = false;
        for(int i = 0; i < array.length; i++){
            if (array[i] == number) {
                isContained = true;
            } else {
                isContained = false;
            }
        }
        //the reason this returns false for 3
        // is that we only return isContained once we have gone through the whole array
        //that means: we change isContained from false to true, to false whenever we look at the next item in the array
        //so this way, true only comes back if n is actually the last item contained in the array
        return isContained;
    }

    // Here is how it works:
    // We need to return true as soon as we find an item contained in the array
    // the return statement marks the end of the operation
    //that means: as soon as the code reaches a return, it breaks out of the loop
    public static boolean containsNumber(int number, int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            if (array[i] == number) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
