package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String arg[]) {

    System.out.print(sumRecurency((short) 5));
    }

    private static int sumRecurency(short number){

        if(number >= 0 ){
            return number + sumRecurency((short) (number-1));
        }
        return 0;
    }
}