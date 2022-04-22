package com.java.Class17;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Please enter first number: ");

                int a = sc.nextInt();

                System.out.println("Please enter second number: ");
                int b = sc.nextInt();

                System.out.println("Please enter the operation (Add/ Div/ Sub/ Mul)");
                String operation = sc.next();


                switch (operation){
                    case "Add":
                        System.out.println(a+b);
                        break;
                    case "Sub":
                        System.out.println(a-b);
                        break;
                    case "Div":
                        System.out.println(a/b);
                        break;
                    case "Mul":
                        System.out.println(a*b);
                        break;
                    default:
                        System.out.println("Invalid choice...please try after hangout");
                }

            }
        }













