class Solution(object):
    def longestMountain(self, arr):
        """
        :type arr: List[int]
        :rtype: int
        """
        longest=0
        for i in range(1,len(arr)-1):
            if arr[i-1]<arr[i]>arr[i+1]:
                left,right=i,i
                while left>0 and arr[left-1]<arr[left]:left-=1
                while right<len(arr)-1 and arr[right]>arr[right+1]:right+=1
                longest=max(longest, right-left+1)
        return longest
