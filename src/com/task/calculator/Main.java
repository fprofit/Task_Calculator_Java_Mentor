package com.task.calculator;

public class Main {

    static String[]  roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void main(String[] args) {
        Input input = new Input();
        while (!roman[0].equals("0"))
            input.setInput();
    }
}
