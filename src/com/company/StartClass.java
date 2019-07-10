package com.company;

import java.util.Scanner;

public class StartClass {
    public void start()
    {
        System.out.println("Input 1 if u want use arabian numbers\nInput 2 if u want to use roman numbers\n");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                ArabianNumbers arabianNumbers = new ArabianNumbers();
                System.out.println("result=" + arabianNumbers.calculation());
                break;
            case 2:
                RomanNumbers romanNumbers = new RomanNumbers();
                romanNumbers.firstromanStringToStringArabian();
                romanNumbers.secondromanStringToStringArabian();
                romanNumbers.arabianStringToInteger();
                romanNumbers.calculation();
                System.out.println("Result = "+ romanNumbers.resultToRoman());
                break;
        }

    }
}
