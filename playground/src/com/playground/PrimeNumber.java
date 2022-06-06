package com.playground;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("End at :");
        int endAt = scan.nextInt();
        int flag = 0;

        if(endAt == 0 || endAt == 1);
        else if(endAt == 2) System.out.println(endAt+" It's a Prime Number");
        else{
            for (int init = 3; init <= endAt; init++){
                for(int i = 2; i < init; i++){
                    if(init % i == 0) {
                        flag = 0;
                        break;
                    }else flag = 1;
                }
                if (flag == 1) System.out.println(init+" It's a Prime Number");
            }
        }
    }
}
