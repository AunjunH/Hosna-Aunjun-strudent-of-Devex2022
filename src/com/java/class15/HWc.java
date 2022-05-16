package com.java.class15;
//String reverse
public class HWc {
    public static void main(String[] args) {
        String word="My name is Hosna";
        String rev=" ";

        for(int i =word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        System.out.println(rev);
        int num=12356;
        int rev1=0;
        int backupnum=num;
        while(num>0){
            int lastnumber=num%10;
            rev1=rev1*10+lastnumber;
            num=num/10;
        }
        System.out.println(rev1);


        int[] data={12,15,13,14,10};
        int max=data[0];

        for (int i=1;i< data.length;i++){
            if(max<data[i] ){
                max=data[i];
            }
        }
        System.out.println(max);

    }




}
