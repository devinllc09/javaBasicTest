package com.example.libjavatest;

public class functioninjavatesst {
    public static double verage(int a,int b, int c){
        return (a+b+c)/3.0;
    }

    public static double averageplus(int a,int b, int c){
    double d= (a+b+c)/3.0;
    return d+1;
    }




    public static void main(String[] args) {
        int a=56;
        int b=87;
        int c =67;
        double avg =(a+b+c)/3.0;
        System.out.println(avg);
        System.out.println(verage(1,2,3));
        System.out.println(averageplus(1,2,3));
    }
}
