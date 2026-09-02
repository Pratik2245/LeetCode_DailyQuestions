import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6 };
        int arr2[] = productExceptSelf(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int answer[] = new int[n];
        answer[0] = 1;
        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        System.out.println(Arrays.toString(answer));

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;

    }

}
