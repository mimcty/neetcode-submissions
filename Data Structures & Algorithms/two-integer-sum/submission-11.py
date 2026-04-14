class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        nums_dict = {num: idx for idx, num in enumerate(nums)}
        for i in range(len(nums)):
            j = target - nums[i]

            if j in nums_dict and i != nums_dict.get(j):
                return [i, nums_dict.get(j)]