package com.company.logic;

import com.company.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class TestLanguage {
    static boolean isArabic = false;
    static boolean isRome = false;
    static ArrayList <String> arabic = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
    static ArrayList <String> roman = new ArrayList<>(Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"));
    static int a;
    static int b;


    protected static void testLanguage(){
        if ( arabic.contains(Main.strings.get(0)) && arabic.contains((Main.strings.get(2)) )){
            isArabic = true;
            a = arabic.indexOf(Main.strings.get(0))+1;
            b = arabic.indexOf(Main.strings.get(2))+1;
        }
        else if ( roman.contains(Main.strings.get(0)) && roman.contains((Main.strings.get(2)) )){
            isRome = true;
            a = roman.indexOf(Main.strings.get(0));
            b = roman.indexOf(Main.strings.get(2));
        }
        

        else System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
    }



}
