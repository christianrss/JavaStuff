package algorithms;

import java.io.*;
import java.util.*;

public class TwoSum {

    static int[] findTwoSum(int nums[], int target) {
        for (int p1 = 0; p1 < nums.length; p1++) {
            int numberToFind = target - nums[p1];
            for (int p2=p1+1; p2 < nums.length; p2++) {
                if (numberToFind == nums[p2])
                    return new int[] {p1,p2};
            }
        }
        return new int[] {};
    }
    public static void main(String args[])
    {
        int nums[] = findTwoSum(new int[] {1,5,3,4,9,2}, 11);
        System.out.println(Arrays.toString(nums));
    }
}
