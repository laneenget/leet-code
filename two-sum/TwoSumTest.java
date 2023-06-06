import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TwoSumTest {
    
    @Test
    public void twoSumTestZero() {
        int[] nums = {0, 0};
        int target = 0;

        TwoSum twoSum = new TwoSum();
        assertEquals(0, twoSum.twoSum(nums, target));
    }

    @Test
    public void twoSumTestSameNumbers() {
        int[] nums = {3, 3};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        assertEquals(6, twoSum.twoSum(nums, target));
    }

    
}
