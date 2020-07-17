package com.task.calculator;

import static com.task.calculator.Main.roman;

public class Calc {
    public void calc(int num1, int num2, char opr, int ch){
        Convert convert = new Convert();
        int result = 0;
        switch (opr){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.print("Wrong sign");
                roman[0] = "0";
                return;
        }
        if(ch == 1)
            System.out.println(result);
        else if(ch == 2)
            System.out.println(convert.intToRome(result));
    }
}
