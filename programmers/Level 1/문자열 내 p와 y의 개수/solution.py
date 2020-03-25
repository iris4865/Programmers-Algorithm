def solution(s):
    return sum([1 if c.lower() == 'p' else -1 if c.lower() == 'y' else 0 for c in s]) == 0
