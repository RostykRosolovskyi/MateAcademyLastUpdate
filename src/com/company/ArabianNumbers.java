package com.company;


import java.util.Scanner;

public class ArabianNumbers implements Calculation {
    private int result;
    private int firstnumber;
    private int secondnumber;
    private Scanner scanner = new Scanner(System.in);
    private char sign;

    public char getSign() {
        return sign;
    }

    public int getFirstnumber() {
        return firstnumber;
    }

    public int getSecondnumber() {
        return secondnumber;
    }

    public ArabianNumbers() {
        System.out.println("Input first arabian number");
        Scanner scanner = new Scanner(System.in);
        firstnumber = scanner.nextInt();
        System.out.println("Input second arabian number");
        secondnumber = scanner.nextInt();
        System.out.println("Input sign");
        sign = scanner.next().charAt(0);
    }

    public int calculation() {


        switch (sign) {
            case '+':
                result = firstnumber + secondnumber;
                break;
            case '-':
                result = firstnumber - secondnumber;
                break;
            case '*':
                result = firstnumber * secondnumber;
                break;
            case '/':
                result = firstnumber / secondnumber;
            default:
                System.out.println("Please input next sign +,-,*,/");

        }
        return result;
    }


}
