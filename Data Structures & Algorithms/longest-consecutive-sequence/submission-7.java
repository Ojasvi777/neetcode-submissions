class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int i = 1;
        int result = 1;
        while(i<nums.length){
            int res = 1;
            while(i<nums.length && nums[i] - 1 == nums[i-1]){
                res++;
                i++;
            if(i<nums.length && nums[i] == nums[i-1]){
                i++;
            }
            }

            result = Math.max(result,res);
            i++;
        }
        
        return result;
        
    }
}
