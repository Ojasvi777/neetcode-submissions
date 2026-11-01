class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}

        for num in nums:
            count[num] = count.get(num, 0) + 1
        arr = list([] for _ in range(len(nums) + 1))
        for i in count.keys():
            arr[count.get(i)].append(i)
        res = []

        while(len(res)<k):
            for i in range(len(arr)-1, 0, -1):
                for j in arr[i]:
                    res.append(j)
                    if(len(res)==k):
                        return res

                


        


                        

                
                
