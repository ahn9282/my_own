def solution(babbling):
    answer = 0
    arr = ["aya", "ye", "woo", "ma"]
    for index, i in enumerate(babbling):
        for j in arr:
            i = i.replace(j, " ")
        if len(i) == 0:
            print(index)
            answer += 1
    return answer


babbling = ["aya", "yee", "u", "maa", "wyeoo"]
answer = solution(babbling)
print(answer)
