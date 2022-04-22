package com.java.CLASS18;

public class Divisibleby1to100 {
    static boolean divisbibleby5(int i) {
        if (i % 5 == 0)  {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        for (int k=1;k<=100;k++){
            if(divisbibleby5(k)==true){
                System.out.println(k);
            }
        }
    }
}
