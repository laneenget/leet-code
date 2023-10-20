package com.mycompany.app;
import java.util.HashMap;

public class TwoSum {

    // Solution in O(n^2) time
    public int[] twoSum(int[] nums, int target) {
        
        boolean foundSolution = false;
        int i = 0;
        int[] solutionList = new int[2];
        
        while (!foundSolution) {
            int j = i + 1;

            while (j < nums.length && i < nums.length) {
                if (nums[i] + nums[j] == target) {
                    solutionList[0] = i;
                    solutionList[1] = j;
                    foundSolution = true;
                } else {
                    j++;
                }
                i++;
            }
        }
        return solutionList;
    }

    // Solution in O(n) time
    // HashMap is useful to store the key-value of pairs of the num array
    // so we can look up the number that allows us to hit the target
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        indexMap = createIndexMap(nums);

        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = (Integer)(target - nums[i]);
            if (indexMap.containsKey(requiredNum)){
                int solutionList[] = {indexMap.get(requiredNum), i};
                return solutionList;
            }
        }
        return null;
    }

    public HashMap<Integer, Integer> createIndexMap(int[] nums) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }
        
        return indexMap;
    }

    public int[] StringToIntArray(String userInput) {
        String[] stringNums = userInput.split(" ");
        int[] nums = new int[stringNums.length];
        for (int i = 0; i < stringNums.length; i++) {
            nums[i] = Integer.parseInt(stringNums[i]);
        }
        return nums;
    }
}