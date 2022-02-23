package com.company;

import java.util.Scanner;

class Main
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        n=sc.nextInt();

        System.out.println("Add Up To("+n+") ----->"+addUpTo(n));
    }
    static int addUpTo(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
}