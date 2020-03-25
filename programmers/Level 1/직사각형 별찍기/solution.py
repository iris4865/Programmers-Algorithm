def solution(n, m):
    for _ in range(m):
        print('*'*n)

n, m = map(int, input().strip().split(' '))
solution(n, m)
