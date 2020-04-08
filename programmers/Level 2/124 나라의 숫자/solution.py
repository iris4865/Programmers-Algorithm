def solution(n):
  tri = '412'

  q = (n-1) // 3
  r = n % 3
  return solution(q) + tri[r] if q else tri[r]
