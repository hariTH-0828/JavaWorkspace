package com.playground;

import java.util.*;

public class TwoSum {

    /*  S1 : First compare with number i and j, If i and j is equal to target then return position else no is not equal to target.
        S2 : Then, Check i and j which is greater, if i is greater than j = i. and check the greater No. is not greater than target.
        S3 : Check with next number. If j and i is != target.
        S4:  Then, repeat S2.
     */
    public void Sum(HashMap<Integer, Integer> nums, int target){
        int i , j = 2;
        for(i = 1; i <= nums.size();i++){
            if(i == j){
                i++;
            }else {
                if (target == nums.get(i) + nums.get(j)) {
                    System.out.println(j + " " + i);
                    break;
                } else {
                    if (nums.get(i) > nums.get(j) && target > nums.get(i) && target > nums.get(i))
                        j = i;
                    else j++;

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,Integer> nums = new HashMap<>();
        TwoSum ts = new TwoSum();

        System.out.println("Enter -1 to Quit :");
        int value = 0;
        int i = 1;
        while(value != -1){
            value = scan.nextInt();
            if(value != -1) {
                nums.put(i, value);
                i++;
            }
        }

        System.out.println("Enter the target number :");
        int target = scan.nextInt();

        System.out.println(nums);
        ts.Sum(nums,target);
    }
}
