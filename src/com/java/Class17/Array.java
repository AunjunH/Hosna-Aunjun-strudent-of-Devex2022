package com.java.Class17;
// print a array from 1-5 and check the total max and min number
public class Array {
    public static void main(String[] args) {
        int[]num=new int[5];
        int sum=0;
        for(int i=0;i< num.length;i++){
            sum=sum+i;

        }
        System.out.println("total number is "+sum);

        int ave=sum/ num.length;
        System.out.println("total average is "+ ave);
        int max=num[0];
        for(int i=1;i< 5;i++){
            if(max< num[i]){
                max=num[i];
            }
        }
        System.out.println("maximum number is " +max);
    }
}
