def solution(n, arr1, arr2):
    return [''.join('#' if c=='1' else ' ' for c in bin(arr1[i] | arr2[i])[2:].zfill(n)) for i in range(n)]
