package com.java.class15;
// count the even number from 1 to 10
public class chw1 {
    public static void main(String[] args) {
        int numb = 546321;
        int rev = 0;
        int backup = numb;

        while (numb > 0) {
            int lastnumber = numb % 10;
            rev = rev * 10 + lastnumber;
            numb = numb / 10;
        }
        System.out.println(rev);
        if (rev == backup) {
            System.out.println(rev + " is palindrome");
        } else {
            System.out.println(rev + "is not a palindrome");
        }

    }
}


