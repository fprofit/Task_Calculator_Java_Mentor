package com.task.calculator;

import static com.task.calculator.Main.roman;

public class Convert {
    public String intToRome(int value){
        String result="";
        if(value<0){
            result="-";
            value = value * -1;
        }
        while (value>0){
            if ((value/100)>=1){
                result=result+"C";
                value=value-100;
            }
            if ((value/90)>=1){
                result=result+"XC";
                value=value-90;
            }
            else if ((value/50)>=1){
                result=result+"L";
                value=value-50;
            }
            else if ((value/40)>=1){
                result=result+"XL";
                value=value-40;
            }
            else if ((value/10)>=1){
                result=result+"X";
                value=value-10;
            }
            else if ((value/1)>=1){
                result=result+roman[value-1];
                value=value-value;
                break;
            }
        }
        return result;
    }
}
