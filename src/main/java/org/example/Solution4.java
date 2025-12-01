package org.example;

import java.util.Arrays;

public class Solution4 {
    public int maximumGap(int[] nums) {
        // 修正：直接使用nums.length判断
        if (nums.length < 2) {
            return 0;
        }

        int n = nums.length;
        long exp = 1;
        int[] buf = new int[n];  // 修正：使用n而不是n-1
        int maxVal = Arrays.stream(nums).max().getAsInt();

        // 基数排序
        while (maxVal >= exp) {  // 修正：条件改为 >=
            int[] cnt = new int[10];

            // 统计每个数字的出现次数
            for (int i = 0; i < n; i++) {
                int digit = (int)((nums[i] / exp) % 10);  // 修正：添加强制类型转换
                cnt[digit]++;
            }

            // 计算前缀和
            for (int i = 1; i < 10; i++) {
                cnt[i] += cnt[i - 1];
            }

            // 从后往前放置元素，保证稳定性
            for (int i = n - 1; i >= 0; i--) {
                int digit = (int)((nums[i] / exp) % 10);  // 修正：添加强制类型转换
                buf[cnt[digit] - 1] = nums[i];
                cnt[digit]--;
            }

            // 复制回原数组
            System.arraycopy(buf, 0, nums, 0, n);
            exp *= 10;  // 修正：乘以10而不是加10
        }

        // 计算最大间隔
        int maxGap = 0;
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }
        return maxGap;
    }
}
