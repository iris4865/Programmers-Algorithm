def solution(dartResult):
    scores = []
    temp = ''
    for c in dartResult:
        if c.isdigit():
            temp += c
        elif c == 'S':
            scores.append(int(temp))
            temp = ''
        elif c == 'D':
            scores.append(int(temp) ** 2)
            temp = ''
        elif c == 'T':
            scores.append(int(temp) ** 3)
            temp = ''
        elif c == '#':
            scores[-1] *= -1
        elif c == '*':
            if len(scores) > 1:
                scores[-2] *= 2
            scores[-1] *= 2

    return sum(scores)
