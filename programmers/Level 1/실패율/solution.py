def solution(N, stages):    
    answer = []
    for i in range(1, N+1):
        player = len(stages)

        stages = [s for s in stages if s > i]
        fail = player - len(stages)

        fail_rate = fail/player if player else 0
        answer.append((i, fail_rate))

    return [lst[0] for lst in sorted(answer, key= lambda x: x[1], reverse=True)]
