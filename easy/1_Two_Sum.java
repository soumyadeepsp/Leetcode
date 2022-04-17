import java.util.*;
class TwoSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] ans = twoSum(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
        scan.close();
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i=0; i<n; i++) {
            map.put(nums[i], i);
        }
        int[] ans = new int[2];
        for (int i=0; i<n; i++) {
            if (map.containsKey(target-nums[i]) && i!=map.get(target-nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
            }
        }
        return ans;
    }
}