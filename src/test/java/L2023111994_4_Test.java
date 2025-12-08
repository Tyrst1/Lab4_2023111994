import org.example.Solution4;
import org.junit.Test;
import static org.junit.Assert.*;
public class L2023111994_4_Test {

    Solution4 solution = new Solution4();

    @Test
    public void testNormalCase() {
        int[] nums = {3, 6, 9, 1};
        assertEquals(3, solution.maximumGap(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {10};
        assertEquals(0, solution.maximumGap(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, solution.maximumGap(nums));
    }

    @Test
    public void testTwoElements() {
        int[] nums = {1, 100};
        assertEquals(99, solution.maximumGap(nums));
    }

    @Test
    public void testDuplicateElements() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(0, solution.maximumGap(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000, 1, 1000000000};
        assertEquals(999000000, solution.maximumGap(nums));
    }

    @Test
    public void testRandomOrder() {
        int[] nums = {1, 10, 5, 2, 8};
        assertEquals(3, solution.maximumGap(nums));
    }

    @Test
    public void testSortedArray() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, solution.maximumGap(nums));
    }

    @Test
    public void testReverseSortedArray() {
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(1, solution.maximumGap(nums));
    }

    @Test
    public void testWithZero() {
        int[] nums = {0, 100, 50};
        assertEquals(50, solution.maximumGap(nums));
        }
 
}
