package com.apnacollage_tutorials_practice;

public class $Pattern {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){

            for (int j=10; j>i; j--){
                System.out.print(" ");
            }for (int k=i; k>0; k--){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
