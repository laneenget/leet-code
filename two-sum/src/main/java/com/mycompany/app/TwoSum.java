package com.mycompany.app;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class TwoSum {

    // Solution in O(n^2) time
    public int[] twoSum(int[] nums, int target) {
        
        boolean foundSolution = false;
        int i = 0;
        int j = i + 1;
        int[] solutionList = null;

        while (!foundSolution && j < nums.length && i < nums.length) {
            if (nums[i] + nums[j] == target) {
                solutionList = new int[2];
                solutionList[0] = i;
                solutionList[1] = j;
                foundSolution = true;
            } else {
                j++;
            }
        }

        return solutionList;
    }

    // Solution in O(n) time
    // HashMap is useful to store the key-value of pairs of the num array
    // so we can look up the number that allows us to hit the target
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, List<Integer>> indexMap = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!indexMap.containsKey(num)) {
                indexMap.put(num, new ArrayList<>());
            }
            indexMap.get(num).add(i);
        }
    
        int solutionList[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer requiredNum = (Integer)(target - nums[i]);
            if (indexMap.containsKey(requiredNum)) {
                List<Integer> indices = indexMap.get(requiredNum);
                for (int j = 0; j < indices.size(); j++) {
                    if (indices.get(j) != i) {
                        solutionList[0] = indices.get(j);
                        solutionList[1] = i;
                        break;
                    }
                }
            }
        }
        return solutionList;
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