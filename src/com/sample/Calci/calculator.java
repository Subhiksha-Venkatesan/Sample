package com.sample.Calci;

import java.util.Scanner;

public class calculator {
    public static float add(float a, float b) {
        return a + b;
    }
    public static float sub(float a, float b) {
        return a - b;
    }
    public static float mul(float a, float b) {
        return a * b;
    }
    public static float div(float a, float b) {
        if(b==0)
            throw new ArithmeticException();
        else
            return a / b;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers and operations(+-*/)");
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        char op=sc.next().charAt(0);
        float ans;
        switch (op)
        {
            case '+':
                ans=add(a,b);
                break;
            case '-':
                ans=sub(a,b);
                break;
            case '*':
                ans=mul(a,b);
                break;
            case '/':
                ans=div(a,b);
                break;
            default:
                return ;
        }
        System.out.println(ans);
    }
}
