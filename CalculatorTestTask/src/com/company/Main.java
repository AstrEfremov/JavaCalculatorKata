package com.company;

import com.company.logic.Logic;

import java.util.*;

public class Main {
    public static List<String> strings = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));

    }
    public static String calc(String input){
        Collections.addAll(strings, input.split(" "));
    return String.valueOf(Logic.romeOrArabic());
    }

}
