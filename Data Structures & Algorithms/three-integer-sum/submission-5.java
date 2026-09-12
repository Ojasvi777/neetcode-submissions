class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l1 = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // If the smallest number is positive, the sum can never be 0
            if (nums[i] > 0) break;

            // 1. Skip duplicate values for 'i' (Fixes [0, 0, 0, 0] giving duplicates)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[l] + nums[r];

                if (sum == target) {
                    l1.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    // Move both pointers
                    l++;
                    r--;

                    // 2. Skip duplicate values for 'l' and 'r'
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return l1;
    }
}