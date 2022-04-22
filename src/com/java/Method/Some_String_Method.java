package com.java.Method;

import java.util.Locale;

public class Some_String_Method {
    public static void main(String[] args) {
        String str1= "I am trying";
        String str2= "i am trying";
        String str3= "We are trying";
        String str4= "";
        String str5= "  ";
        System.out.println(str1.equals(str2));// check equality.
        System.out.println(str1.equalsIgnoreCase(str2));//check equality ignoring case
        System.out.println(str1.contains(str2));// check contains
        System.out.println(str3.toLowerCase(Locale.ROOT));//make lower case
        System.out.println(str2.toUpperCase(Locale.ROOT));//make whole thing upper case
        System.out.println(str3.toLowerCase(Locale.ROOT).contains(str2));//if str3 contains str2
        System.out.println(str3.toLowerCase(Locale.ROOT).contains(str2));//Make str3 lower case and check if it contais str2
        System.out.println("1. Index of char : "+str1.indexOf('a'));//find index of character.to find char we have to put the char not number.
        System.out.println("2. Index of char : "+str2.indexOf('m'));//index char start from 0 1 2 and so on.space is also counted.
        System.out.println("3. Index of char : "+str3.lastIndexOf('y'));// char always count from left to right. though index search char from right to left
        System.out.println("4. Find character at index: "+str3.charAt(7));// check the chat at index.
        System.out.println("5. length of String : "+str1.length());//to check the length of string (by counting index)
        System.out.println("6. length of String : "+str3.length());//length bracket is always empty.
        System.out.println("7. to check empty or not: "+str4.isEmpty());// to check in the " " its blank or empty.
        System.out.println("8. to check blank or empty : "+str5.isEmpty());// As i dont have blank option because of old version.


        // Replace & replace all
        String str6= "INR 200 INR 300 INR 400";
        System.out.println("9. replace :"+str6.replace("INR","USD"));
        System.out.println("9. replace: "+str3.replace("we","Students"));
        System.out.println("10.replace : "+str1.replace("I","student"));
        System.out.println("10. : "+str4.replace("trying","playing"));
        System.out.println("10. replace: "+str3.replace("are","been"));


        //format (%s)
        System.out.println(String.format(  str2,"trying","Playing" ));

        String str7= "welcome to my world";
        System.out.println(String.format("welcome","hello"));
        System.out.println(String.format(str7,"welcome","hello"));
        System.out.println(String.format(str7,"hello","welcome"));

        //split
        String str8= "I love my family";
        String[]words=str8.split(" ");// rules: to split we have to use string[]words=str.split(" "),Must have space between " ".

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        String str9= "we are good citizen";
        String[]myword= str9.split(" ");// not words, only type word after String[].
        System.out.println(myword[0]);//we cant make variable with space. whatever varible name is taken must put same variable inside[].
        System.out.println(myword[1]);
        System.out.println(myword[2]);
        System.out.println(myword[3]);
       // using for loop writing 1 time split.

       for(int i=0;i<=3;i++){
           System.out.println(myword[i]);// Here i use for loops and printout i took the string variable name which i choose myword.when i print i use variable name myword[i].
           String str10="My   wold   colorfull";
           System.out.println(str10.length());
           String[] selectword= str10.split(" ");
           for(int j=0;j< words.length;j++){
               System.out.println(selectword[j]);
               // in between my world colorfull here is more then space so that counted as
               String str11 ="We are happy family with 4 members";// make it split with for loops.
               String [] choosenword=str11.split("");

              // for(int k=0;k< choosenword.length();k++);
              // System.out.println(choosenword[k]);

           }


       }



    }
}
