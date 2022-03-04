package fh.campus02;

public class DoWhile {

    public static void main(String[] args) {
        countToAHundred(1);
        countToAHundredInclusive(0);
        countToAHundredThree(1);
    }

    public static void countToAHundred(int from) {
        System.out.println(from);
        do {
            from++;
            System.out.println(from);
        } while (from < 100);
    }

    public static void countToAHundredInclusive(int from) {
        do {
            System.out.println(from);
            from++;
        } while (from < 100);
    }

    public static void countToAHundredThree(int from) {
        do {
            System.out.println(from);
            from++;
        } while (from <= 100);
    }
}
