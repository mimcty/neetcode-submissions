class Solution:
    def topKFrequent(self, nums: List[int], k: int):
        freq_dict = {}
        top_freq = [0] * k
        top_nums = [0] * k

        for num in nums:
            if num not in freq_dict:
                freq_dict[num] = 1
            else:
                freq_dict[num] += 1

        if k == len(freq_dict):
            return list(freq_dict.keys())


        for key, val in freq_dict.items():
            min_idx = top_freq.index(min(top_freq))
            if val > top_freq[min_idx]:
                top_freq[min_idx] = val
                top_nums[min_idx] = key

        return top_nums
        
        