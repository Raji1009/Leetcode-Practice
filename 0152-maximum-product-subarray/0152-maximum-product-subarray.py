class Solution(object):
    def maxProduct(self, nums):
        cur_max = nums[0]
        cur_min = nums[0]
        ans = nums[0]
        for x in nums[1:]:
            tmp = cur_max
            cur_max = max(x, x * cur_max, x * cur_min)
            cur_min = min(x, x * tmp, x * cur_min)
            ans = max(ans, cur_max)
        return ans