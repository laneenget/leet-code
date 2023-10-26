package com.mycompany.app;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void twoSumTestWithValidInput() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};
        
        assertArrayEquals(expectedResult, twoSum.twoSum(nums, target));
    }

    @Test
    public void twoSumTestWithNoValidInput() {
        int[] nums = {2, 7, 11, 15};
        int target = 100;
        int[] expectedResult = new int[2];

        assertArrayEquals(expectedResult, twoSum.twoSum(nums,target));
    }

    @Test
    public void twoSumTestHashMapWithValidInput() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        assertArrayEquals(expectedResult, twoSum.twoSumHashMap(nums, target));
    }

    @Test
    public void twoSumTestHashMapWithNoValidInput() {
        int[] nums = {2, 7, 11, 15};
        int target = 100;
        int[] expectedResult = null;

        assertArrayEquals(expectedResult, twoSum.twoSumHashMap(nums, target));
    }

    @Test
    public void twoSumTestEmptyArray() {
        int[] nums = {};
        int target = 9;
        int[] expectedResult = new int[2];

        assertArrayEquals(expectedResult, twoSum.twoSum(nums, target));
    }

    @Test
    public void twoSumTestHashMapEmptyArray() {
        int[] nums = {};
        int target = 9;
        int[] expectedResult = null;

        assertArrayEquals(expectedResult, twoSum.twoSumHashMap(nums, target));
    }

    @Test
    public void twoSumTestDuplicateNums() {
        int[] nums = {3, 3, 6, 5};
        int target = 6;
        int[] expectedResult = {0, 1};


        assertArrayEquals(expectedResult, twoSum.twoSum(nums, target));
    }

    @Test
    public void twoSumTestHashMapDuplicateNums() {
        int[] nums = {3, 3, 6, 5};
        int target = 6;
        int[] expectedResult = {0, 1};

        assertArrayEquals(expectedResult, twoSum.twoSumHashMap(nums, target));
    }

    //TODO: twoSumTargetNotFound

    //TODO: twoSumHashMapTargetNotFound

    //TODO: twoSumOutOfBounds

    //TODO: twoSumHashMapOutOfBounds

    @Test
    public void twoSumTestZero() {
        int[] nums = {0, 0};
        int target = 0;
        int[] result = twoSum.twoSum(nums, target);

        assertNotNull(result);
        if (result == null) {
            result = new int[2];
        }
        assertEquals(2, result.length);
    }
}