def solution(s):
    import itertools
    import math
    s = list(s)
    temp = []
    target = []
    for i in range(1, len(s) +1):
        temp = list(set(list(map("".join,itertools.permutations(s, i)))))
        target = target + temp

    data = []
    print("target : ", target)
    # 소수 찾기
    for i in target:
        print("i : ", i)
        print("i[0] : ", i[0])
        if(i == "1" or i[0] == "0"):
            data.append(i)
            continue

        for j in range(2, round(math.sqrt(int(i)))+1):
            if(int(i) % j == 0 ):
                print("remove : ",i)
                data.append(i)
    data = list(set(data))
    for i in data:
        target.remove(i)

    return len(target)