import org.example.Solution4;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试用例设计原则：
 * 1. 等价类划分：正常数组、空数组、单元素数组、重复元素数组
 * 2. 边界值分析：最小值、最大值、边界情况
 * 3. 特殊值测试：负数、零、正数混合
 * 4. 性能测试：大数组测试（在线性时间内运行）
 */
public class L2023111994_4_Test {

    Solution4 solution = new Solution4();

    /**
     * 测试目的：验证正常情况下的最大间隔计算
     * 测试用例：[3,6,9,1] 排序后为 [1,3,6,9]，最大间隔为3
     */
    @Test
    public void testNormalCase() {
        int[] nums = {3, 6, 9, 1};
        assertEquals(3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证单元素数组返回0
     * 测试用例：[10] 应该返回0
     */
    @Test
    public void testSingleElement() {
        int[] nums = {10};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证空数组返回0
     * 测试用例：[] 应该返回0
     */
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证两个元素的情况
     * 测试用例：[1,100] 应该返回99
     */
    @Test
    public void testTwoElements() {
        int[] nums = {1, 100};
        assertEquals(99, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证重复元素的情况
     * 测试用例：[5,5,5,5] 排序后相邻差值都是0
     */
    @Test
    public void testDuplicateElements() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(0, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证大数情况
     * 测试用例：包含大整数的数组
     */
    @Test
    public void testLargeNumbers() {
        int[] nums = {1000000, 1, 1000000000};
        assertEquals(999000000, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证随机顺序的数组
     * 测试用例：[1,10,5,2,8] 排序后为 [1,2,5,8,10]，最大间隔为3
     */
    @Test
    public void testRandomOrder() {
        int[] nums = {1, 10, 5, 2, 8};
        assertEquals(3, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证已经排序的数组
     * 测试用例：[1,2,3,4,5] 最大间隔为1
     */
    @Test
    public void testSortedArray() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证逆序数组
     * 测试用例：[5,4,3,2,1] 排序后最大间隔为1
     */
    @Test
    public void testReverseSortedArray() {
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(1, solution.maximumGap(nums));
    }

    /**
     * 测试目的：验证包含0的情况
     * 测试用例：[0,100,50] 排序后为 [0,50,100]，最大间隔为50
     */
    @Test
    public void testWithZero() {
        int[] nums = {0, 100, 50};
        assertEquals(50, solution.maximumGap(nums));
    }
}