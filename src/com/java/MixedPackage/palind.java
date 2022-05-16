package com.java.MixedPackage;
// check palindrome or not
public class palind {
    public static void main(String[] args) {
        String word = "Bangladesh";
        String rev = " ";
        String backupOriginal = word;

        for (int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        if (rev == backupOriginal) {
            System.out.println(rev + "is a palindrome");
        } else {
            System.out.println(rev + " is not a palindrome");
        }
    }
}
