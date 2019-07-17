def solution(arr1, arr2):
    return [ [x+y for x, y in zip(first, second)] for first, second in zip(arr1, arr2) ]
