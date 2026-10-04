import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        boolean ans = hasDuplicate(nums);
        System.out.println(ans);

    }

    public static boolean hasDuplicate(int[] nums) {

        // HashMap<Integer, Integer> hmap = new HashMap<>();
        // boolean flag = true;
        // for (int i = 0; i < nums.length; i++) {
        // if (hmap.containsKey(nums[i])) {
        // return false;
        // }
        // hmap.put(nums[i], 1);
        // }
        // System.out.println(hmap);
        // return true;

        // other option
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}
