def solution(num):
    for i in range(500):
        if num == 1:
            return i
        else:
            num = num * 3 + 1 if num % 2 else num // 2
    return -1
