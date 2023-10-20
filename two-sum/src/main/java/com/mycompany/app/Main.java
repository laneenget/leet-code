package com.mycompany.app;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a series of numbers seperated by spaces. Press enter when done.: ");
        String stringOfInts = scan.nextLine();
        System.out.println("Please enter a target number.: ");
        int target = Integer.parseInt(scan.nextLine());
        scan.close();
        
        TwoSum twoSum = new TwoSum();
        int[] nums = twoSum.StringToIntArray(stringOfInts);
        int[] solutionNoHash = twoSum.twoSum(nums, target);
        int[] solutionWithHash = twoSum.twoSumHashMap(nums, target);
        String noHashOutput = String.format("Solution without using a HashMap.: %d %d", solutionNoHash[0], solutionNoHash[1]);
        String hashOutput = String.format("Solution without using a HashMap.: %d %d", solutionWithHash[0], solutionWithHash[1]);
        System.out.println(noHashOutput);
        System.out.println(hashOutput);
    }
}
