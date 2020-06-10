import heapq

def solution(scoville, k):
    # 힙정렬
    heapq.heapify(scoville)

    # 가장작은 원소
    hot_min = heapq.heappop(scoville)
    
    # 모두 k 이상이면 0 반환
    if(hot_min >= k):
        return 0

    if len(scoville) == 1 and hot_min +(scoville[0] * 2) >= k:
        return 1
    for i in range(1,len(scoville)):
        # 2번째 작은 원소
        second_min = heapq.heappop(scoville)
        print("second_min : ", second_min)
        print("scoville : ", scoville)
        # 가장작은 원소 갱신후 scoville에 넣고 반환
        hot_min = heapq.heappushpop(scoville, hot_min + second_min*2)
        print("hot_min : ",hot_min)

        print("scoville : ", scoville)
        # 남아있는 경우
        if hot_min>=k:
            return i
        # 남은 배열 길이가 1이라 hot_min이 제대로 안되면
        elif len(scoville) <= 1 and hot_min + (scoville[0] * 2) >=k:
            return i+1

    return -1