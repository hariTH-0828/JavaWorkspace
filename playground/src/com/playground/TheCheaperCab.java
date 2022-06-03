package com.playground;
import java.util.Scanner;

public class TheCheaperCab {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] X = new int[T];
        int[] Y = new int[T];
        int i = 0;

        while(i < T){
            X[i] = scan.nextInt();
            Y[i] = scan.nextInt();
            i++;
        }
        i = 0;
        while(i < T) {
            String result = (X[i] == Y[i]) ? "ANY" : (X[i] < Y[i]) ? "First" : "Second";
            System.out.println(result);
            i++;
        }
    }
}
