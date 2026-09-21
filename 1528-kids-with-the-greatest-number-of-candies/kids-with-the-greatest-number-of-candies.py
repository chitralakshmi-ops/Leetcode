class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        return [x + extraCandies >= max(candies) for x in candies]
        