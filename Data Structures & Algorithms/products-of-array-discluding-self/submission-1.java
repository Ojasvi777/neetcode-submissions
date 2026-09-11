class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int prod = 1;
        int prod2 = 1;
        for(int x: nums){
            prod = prod * x;
            if(x==0){
                count++;
            }
        }
        if(count == 1){
            
            for(int x: nums){
            if(x!=0){
            prod2 = prod2 * x;
            }
        }
        }



        int[] res = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
            res[i] = (prod/nums[i]);
            }
            else if(count > 1){
                res[i] = 0;
            }
            else{
                res[i] = prod2;
            }
        }
    
    return res;
    }
}  
