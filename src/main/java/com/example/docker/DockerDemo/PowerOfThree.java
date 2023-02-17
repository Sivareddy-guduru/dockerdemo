package com.example.docker.DockerDemo;

public class PowerOfThree {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(81));
    }

    public static boolean isPowerOfThree(int num)
    {

        while (num % 3 ==0){
            num /=3;
        }
        return num==1;

    }
}
