package fh.campus02;

public class ArithmeticTower {
    public static void main(String[] args) {
        int startValue = 12;

        makeTower(startValue);
    }

    public static void makeTower(int startValue) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " * " + i);
            startValue = startValue * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(startValue + " / " + i);
            startValue = startValue / i;
        }
    }
}
