package com.apnacollage_tutorials_practice;

public class $Pattern_2 {
    public static void main(String[] args) {
        for (int x=0;x<3;x++){
            System.out.println("");
        }
        for (int i=0;i<10;i++){
            for (int j=9; j>i;j--){
                System.out.print("  ");
            }
            for (int k=0; k<=i;k++){
                System.out.print("  * ");
            }
            for (int j1=0; j1<=0;j1++){
                System.out.print(" ");
            }
            for (int k=9; k>i;k--){
                System.out.print(" $  ");
            }
                System.out.println("");
        }
    }
}
