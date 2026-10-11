
public class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(sumOfSquares(arr));
    }

    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (n % i == 0) {
                sum += nums[i - 1] * nums[i - 1];
            }
        }
        return sum;

    }
}
