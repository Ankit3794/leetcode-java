package leetcode;

public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            int area = w * h;
            max = Math.max(max, area);
            if (height[start] < height[end]) {
                start++;
            } else if (height[start] > height[end]) {
                end--;
            } else {
                start++;
                end--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater_11 test = new ContainerWithMostWater_11();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(test.maxArea(nums));
    }
}
