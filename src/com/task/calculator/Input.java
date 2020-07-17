package com.task.calculator;

import java.util.Scanner;
import static com.task.calculator.Main.roman;

public class Input {
    public void setInput() {
        Scanner str = new Scanner(System.in);
        Check check = new Check();
        String[] subStr = str.nextLine().split(" ");
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        if (subStr.length != 3) {
            System.out.print("Wrong entry");
            roman[0] = "0";
            return;
        }
        else if(subStr[1].length() != 1) {
            System.out.print("Wrong sign");
            roman[0] = "0";
            return;
        }

        if (check.checkInput(subStr, arab, 0) == 1) {
            check.checkInput(subStr, arab, 1);
            return;
        } else if (check.checkInput(subStr, roman, 0) == 1) {
            check.checkInput(subStr, roman, 2);
            return;
        } else {
            System.out.print("Wrong numbers");
            roman[0] = "0";
            return;
        }

    }
}