class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            m.put(nums[i],i);
        }

        for(int i = 0; i<nums.length; i++){
            int n = target - nums[i];
            if(m.containsKey(n) && m.get(n)!=i){
                return new int[]{i,m.get(n)};
            }
        }

        return new int[0];
}
}


