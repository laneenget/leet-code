public class TwoSum {

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

    public int[] twoSumHash(int[] nums, int target) {
        int[] solutionList = new int[2];
        return solutionList;
    }
}