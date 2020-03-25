def solution(heights):
    return [max([r+1 if heights[r] > heights[s] else 0 for r in range(s, -1, -1)]) for s in range(len(heights))]