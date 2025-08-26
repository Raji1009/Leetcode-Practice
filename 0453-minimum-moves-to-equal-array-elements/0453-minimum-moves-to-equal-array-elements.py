class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        min_num=min(nums)
        moves=0
        for num in nums:
            moves += num-min_num

        return moves