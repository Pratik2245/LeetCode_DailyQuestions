public class ConstructuUniformArrayParity2 {
    public static void main(String[] args) {

        int arr[] = { 12, 9 };
        System.out.println(uniformArray(arr));
    }

    public static boolean uniformArray(int[] nums) {
        int smallestOdd = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num % 2 == 1)
                smallestOdd = Math.min(smallestOdd, num);
        }

        // Already all even
        if (smallestOdd == Integer.MAX_VALUE)
            return true;

        // even number and less then odd then ok else return false
        for (int num : nums) {
            if (num % 2 == 0 && num <= smallestOdd) {
                return false;
            }
        }
        return true;
    }
}
