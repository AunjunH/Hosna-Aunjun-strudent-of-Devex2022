package com.java.EnhanceforLoop;
// take some number of array from 1 to 10 and add them ave them max them and min them
public class LoopEnhance {
    public static void main(String[] args) {
       // int num[]=new int[5];

        int num[]={1,2,3,4,5};
        int sum=0;
        for(int x:num){
            sum=sum+x;

        }
        int ave=0;
        ave=sum/num.length;
        int max=num[0];
        for(int i=1;i< num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        int min=num[0];
        for(int i=1;i< num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);
        System.out.println("total sum is" +sum);

        System.out.println("total average is"+ave);
    }
}
