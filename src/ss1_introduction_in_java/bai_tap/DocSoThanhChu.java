package ss1_introduction_in_java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = scanner.nextInt();
        String text = "";
        int hundreds = number / 100;
        int ones = number % 10;
        int tens = number % 100 / 10;
        switch (hundreds) {
            case 1:
                text = "One hundred";
                break;
            case 2:
                text = "Two hundred";
                break;
            case 3:
                text = "Three hundred";
                break;
            case 4:
                text = "Four hundred";
                break;
            case 5:
                text = "Five hundred";
                break;
            case 6:
                text = "Six hundred";
                break;
            case 7:
                text = "Seven hundred";
                break;
            case 8:
                text = "Eight hundred";
                break;
            default:
                text = "Nine hundred";
        }
        if (number > 100) {
            text = text + " ";
        }
        if (tens == 1) {
            switch (ones) {
                case 0:
                    text = text + "Ten";
                    break;
                case 1:
                    text = text + "Eleven";
                    break;
                case 2:
                    text = text + "Twelve";
                    break;
                case 3:
                    text = text + "Thirteen";
                    break;
                case 4:
                    text = text + "Fourteen";
                    break;
                case 5:
                    text = text + "Fifteen";
                    break;
                case 6:
                    text = text + "Sixteen";
                    break;
                case 7:
                    text = text + "Seventeen";
                    break;
                case 8:
                    text = text + "Eighteen";
                    break;
                default:
                    text = text + "Nineteen";
            }
        }
        switch (tens) {
            case 2:
                text = text + "Twenty";
                break;
            case 3:
                text = text + "Thirty";
                break;
            case 4:
                text = text + "Forty";
                break;
            case 5:
                text = text + "Fifty";
                break;
            case 6:
                text = text + "Sixty";
                break;
            case 7:
                text = text + "Seventy";
                break;
            case 8:
                text = text + "Eighty";
                break;
            default:
                text = text + "Ninety";
        }
        if (number > 100 && number < 110) {
            text = text + "and ";
        } else if (number > 10) {
            text = text + " ";
        }
        if (tens != 1) {
            switch (ones) {
                case 0:
                    if (number < 10) {
                        text = text + "Zero";
                    }
                    break;
                case 1:
                    text = text + "One";
                    break;
                case 2:
                    text = text + "Two";
                    break;
                case 3:
                    text = text + "Three";
                    break;
                case 4:
                    text = text + "Four";
                    break;
                case 5:
                    text = text + "Five";
                    break;
                case 6:
                    text = text + "Six";
                    break;
                case 7:
                    text = text + "Seven";
                    break;
                case 8:
                    text = text + "Eight";
                    break;
                default:
                    text = text + "Nine";
            }
        }
        System.out.println(number + " is " + text);
    }
}
