package com.company.logic;

import com.company.Main;

import static com.company.logic.TestLanguage.*;

public class Logic {

    public static int logic(){

        TestLanguage.testLanguage();
        char character =  Main.strings.get(1).charAt(0);
        int returnResult;
        switch (character) {
            case '+': return returnResult = a + b;
            case '-': return returnResult = a - b;
            case '*': return returnResult = a * b;
            case '/': return returnResult = a / b;
            default:  returnResult = 0;
                System.out.println("unknown operation");
        }
    return returnResult;
    }
    public static String romeOrArabic() {
        String preResult = String.valueOf(logic());
        String result = String.valueOf(logic());
        if (isRome) {
            if (Integer.parseInt(preResult) <= 0) {
                result = "throws Exception //т.к. в римской системе нет отрицательных чисел и нуля";
            } else {
                result = "";
                int firstNumber = Integer.parseInt(Character.toString(preResult.charAt(0)));
                if (preResult.length() > 1) {
                   int secondNumber = Integer.parseInt(Character.toString(preResult.charAt(1)));
                    result = switch (firstNumber) {
                        case 1 -> "X" + roman.get(secondNumber);
                        case 2 -> "XX" + roman.get(secondNumber);
                        case 3 -> "XXX" + roman.get(secondNumber);
                        case 4 -> "XL" + roman.get(secondNumber);
                        case 5 -> "L" + roman.get(secondNumber);
                        case 6 -> "LX" + roman.get(secondNumber);
                        case 7 -> "LXX" + roman.get(secondNumber);
                        case 8 -> "LXXX" + roman.get(secondNumber);
                        case 9 -> "XC" + roman.get(secondNumber);
                        default -> result;
                    };
                } else result = roman.get(firstNumber);
            }

        }
        return result; }
}
