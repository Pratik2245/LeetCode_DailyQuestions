import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class topKFrequentElements {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int arr2[] = topKFrequent(nums, k);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int i = 0;
        int res[] = new int[k];
        for (int index = bucket.length - 1; index >= 0; index--) {
            if (bucket[index] != null) {
                if (i == k) {
                    break;
                }
                for (int num : bucket[index]) {
                    res[i++] = num;
                }

            }
        }
        return res;
    }
}