package com.edu.cnu;

/**
 * Created by ghu33 on 2017-04-17.
 */
public class Calculator {
    public int add(int i, int j) {
        return i+j;
    }

    public int multi(int i, int j) {
        return i*j;
    }

    public int divide(int i, int j) {
        return i/j;
    }

    public int factorial(int i) {
        int result;
        if(i > 0)
            result = i * factorial(i-1);
        else if(i == 0)
            return 1;
        else{
            return 0;
        }
        return result;
    }
}
