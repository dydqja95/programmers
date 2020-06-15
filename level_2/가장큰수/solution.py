def solution(numbers):
    from itertools import permutations
    import heapq

    temp = list(permutations(numbers,len(numbers)))

    target = []
    for i in temp:
        word = ""
        for j in i:
            
            word = word + str(j)
        heapq.heappush(target, (-int(word), int(word)))
 
    return str(heapq.heappop(target)[1])