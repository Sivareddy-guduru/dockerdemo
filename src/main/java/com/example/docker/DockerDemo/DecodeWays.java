package com.example.docker.DockerDemo;

public class DecodeWays {

    public static void main(String[] args) {


        System.out.println(numDecodings("0"));
    }

    /*public static int numDecodings(String s) {
       int length = s.length();
       if(s.charAt(0) == '0'){
           return 0;
       }
       int count =0;
       int start =0;
       for(int i=0;i<length;i++){
           if(Integer.parseInt(String.valueOf(s.charAt(i)))>0) {
               count += 1;
           }
           while (i-start>=2 && i<length-2) {
               int num = Integer.parseInt(s.substring(start, 2));
               if (num >= 10) {
                   count += 1;
               }
           }
       }
       return count;
    }*/

    public static int numDecodings(String s)
    {
        int length = s.length();
        int[] dp = new int[length+1];
        dp[0] = 1;
        dp[1] = s.charAt(0)=='0'?0:1;
        for(int i=2;i<=length;i++){
              int firstDigit = Integer.parseInt(s.substring(i-1,i));
              int twoDigit = Integer.parseInt(s.substring(i-2,i));
              if(firstDigit>0){
                  dp[i]+=dp[i-1];
              }
              if(twoDigit>=10 && twoDigit <=26){
                  dp[i]+=dp[i-2];
              }

        }
        return dp[length];
    }

}
