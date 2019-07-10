package com.company;

import java.util.Scanner;

public class RomanNumbers implements Calculation {
    private int result;
    private String romanresult;
    private String firstromannnumber;
    private String secondromannumber;
    private Scanner scanner = new Scanner(System.in);
    private char sign;
    private int firstarabiannumber;
    private int secondarabiannumber;

    public RomanNumbers() {
        System.out.println("Input first roman number");
        Scanner scanner = new Scanner(System.in);
        firstromannnumber = scanner.nextLine();
        System.out.println("Input second roman number");
        secondromannumber = scanner.nextLine();
        System.out.println("Input sign");
        sign = scanner.next().charAt(0);
    }

    public void firstromanStringToStringArabian() {
        firstromannnumber.toUpperCase();
        switch (firstromannnumber) {
            case "I":
                firstromannnumber = "1";
                break;
            case "II":
                firstromannnumber = "2";
                break;
            case "III":
                firstromannnumber = "3";

                break;
            case "IV":
                firstromannnumber = "4";

                break;
            case "V":
                firstromannnumber = "5";

                break;
            case "VI":
                firstromannnumber = "6";

                break;
            case "VII":
                firstromannnumber = "7";

                break;
            case "VIII":
                firstromannnumber = "8";

                break;
            case "IX":
                firstromannnumber = "9";

                break;
            case "X":
                firstromannnumber = "10";

                break;
            default:
                System.out.println("Please input correct roman numbers from I-X");
        }
    }

    public void secondromanStringToStringArabian() {
        secondromannumber.toUpperCase();
        switch (secondromannumber) {
            case "I":
                secondromannumber = "1";
                break;
            case "II":
                secondromannumber = "2";
                break;
            case "III":
                secondromannumber = "3";
                break;
            case "IV":
                secondromannumber = "4";
                break;
            case "V":
                secondromannumber = "5";
                break;
            case "VI":
                secondromannumber = "6";
                break;
            case "VII":
                secondromannumber = "7";
                break;
            case "VIII":
                secondromannumber = "8";
                break;
            case "IX":
                secondromannumber = "9";
                break;
            case "X":
                secondromannumber = "10";
                break;
            default:
                System.out.println("Please input correct roman numbers from I-X");
        }
    }

    public void arabianStringToInteger() {
        firstarabiannumber = Integer.parseInt(firstromannnumber);
        secondarabiannumber = Integer.parseInt(secondromannumber);
    }

    public int calculation() {

        switch (sign) {
            case '+':
                result = firstarabiannumber + secondarabiannumber;
                break;
            case '-':
                result = firstarabiannumber - secondarabiannumber;
                break;
            case '*':
                result = firstarabiannumber * secondarabiannumber;
                break;
            case '/':
                result = firstarabiannumber / secondarabiannumber;
            default:
                System.out.println("Please input next sign +,-,*,/");

        }
        return result;
    }

    public String resultToRoman() {
        switch (result) {
            case 1:
                romanresult = "I";
                break;
            case 2:
                romanresult = "II";
                break;
            case 3:
                romanresult = "III";
                break;
            case 4:
                romanresult = "IV";
                break;
            case 5:
                romanresult = "V";
                break;
            case 6:
                romanresult = "VI";
                break;
            case 7:
                romanresult = "VII";
                break;
            case 8:
                romanresult = "VIII";
                break;
            case 9:
                romanresult = "IX";
                break;
            case 10:
                romanresult = "X";
                break;
            case 11:
                romanresult = "XI";
                break;
            case 12:
                romanresult = "XII";
                break;
            case 13:romanresult="XIII";
                break;
            case 14:romanresult="XIV";
                break;
            case 15:romanresult="XV";

            case 16:romanresult="XVI";
                break;
            case 17:romanresult="XVII";
                break;
            case 18:romanresult="XVIII";
                break;
            case 19:romanresult="XIX";
                break;
            case 20:romanresult="XX";
                break;

            default:
                System.out.println("Wrong number");


        }
        return romanresult;
    }

}
