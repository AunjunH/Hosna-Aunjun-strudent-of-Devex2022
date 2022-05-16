package com.java.groupProject;
// Write a program to find out max and min numbers from Array
public class MaxMin {
    public static void main(String[] args) {
        int[]data={13,75,2,55,25,85};

        int max=data[0];
        int min=data[0];

        for(int i=1;i< data.length;i++){
            if(max< data[i]){
                max= data[i];
            }if(min>data[i]){
                min=data[i];
            }
        }

        System.out.println("the max number is "+ max);
        System.out.println("the min number is "+ min);


            }

}
