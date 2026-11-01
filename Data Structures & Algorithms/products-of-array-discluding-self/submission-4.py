class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if(nums == [0]*len(nums)):
            return nums
        prod = 1
        prod2 = 1
        count = 0
        for i in range(len(nums)):
            if(nums[i]==0):
                count +=1
            if nums[i] != 0:
                prod *= nums[i]
            prod2 *= nums[i]
        if(count>1):
            return [0] * len(nums)
        res = []
        for i in range(len(nums)):
            if(nums[i] == 0):
                res.append(int(prod))
            else:
                res.append(int(prod2/nums[i]))
        return res