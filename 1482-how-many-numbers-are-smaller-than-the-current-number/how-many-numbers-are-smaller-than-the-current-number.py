class Solution:
    def smallerNumbersThanCurrent(self, nums: list[int]) -> list[int]:
        return [sum(y < x for y in nums) for x in nums]
        