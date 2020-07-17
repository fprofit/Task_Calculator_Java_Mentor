package com.task.calculator;

public class Check {
    public int checkInput(String[] subStr, String[] arr, int ch){
        Calc calc = new Calc();
        for(int i = 0; i <= 9; i++){
            if(subStr[0].equals(arr[i])){
                for(int j = 0; j <= 9; j++){
                    if(subStr[2].equals(arr[j])){
                        if(ch == 0)
                            return 1;
                        else if(ch > 0)
                            calc.calc(i+1, j+1, subStr[1].charAt(0), ch);
                        return 0;
                    }
                }
                return 0;
            }
        }
        return 0;
    }
}
