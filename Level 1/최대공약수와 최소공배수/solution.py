def solution(n, m):
    a, b = max(n, m), min(n, m)
    mod = a % b

    while mod > 0:
        a = b
        b = mod
        mod = a % b

    return [b, (n*m)//b]
