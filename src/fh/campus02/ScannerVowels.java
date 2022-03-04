package fh.campus02;

import java.util.Scanner;

public class ScannerVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = scanner.next();

        while (!letter.equals("0")) {
            checkIfVowel(letter);
            System.out.println("Enter next letter");
            letter = scanner.next();
        }

        System.out.println("Game over");
        scanner.close();
    }

    public static void checkIfVowel(String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("The letter " + letter + " is a vowel!");

        } else {
            System.out.println("Your letter " + letter + " is not a vowel");
        }
    }
}
