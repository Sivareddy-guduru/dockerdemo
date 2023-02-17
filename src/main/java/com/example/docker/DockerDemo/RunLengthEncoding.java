package com.example.docker.DockerDemo;

public class RunLengthEncoding {

    public static void main(String[] args) {
       String input = "";

        System.out.println(runLengthEncoding(input));
    }


    public static String runLengthEncoding(String a)
    {

        int length = a.length();
        if(length == 0) return "";
        char ch = a.charAt(0);
        String res = "";
        int count = 1;
        for(int i=1;i<length;i++){
            if(a.charAt(i) ==ch){
                count++;
                continue;
            }
            res += String.valueOf(ch)+count;
            ch = a.charAt(i);
            count=1;
        }
        res += String.valueOf(ch)+count;

      return  res;
    }
}
