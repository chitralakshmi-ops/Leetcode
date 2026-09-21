class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        return __import__('functools').reduce(
            lambda a, b: a ^ b,
            range(start, start + 2 * n, 2)
        )  