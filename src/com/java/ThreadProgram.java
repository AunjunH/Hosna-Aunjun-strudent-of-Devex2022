package com.java;
// Write java Program to Find Smallest and Largest Element in an Array.
public class ThreadProgram {
    public static void main(String[] args) {
        int [] num= {10,12,15,18,25};
         int max= num[0];
         int min=num[0];

         for(int i=1;i< num.length;i++){
             if(i<num.length){
                 max=num[i];
             }
         }
         for(int j=1;j< num.length;j++){
             if(j> num.length){
                 min=num[j];
             }
         }
        System.out.println("the maximum is " + max);
        System.out.println("the minimum is "+ min);

    }
}
