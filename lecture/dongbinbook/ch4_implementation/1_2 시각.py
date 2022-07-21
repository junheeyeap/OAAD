# 완전 탐색 유형

# 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오
# 예를 들어 1을 입력했는데 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각이다
# 00시 00분 03초
# 00시 13분 30초
# 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각이다
# 00시 02분 55초
# 01시 27분 45초

N = int(input())

count = 0

for i in range(N+1):
    for j in range(60):
        for k in range(60):
            # 매 시각 안에 3이 포함되어 있으면 카운트 증가
            if '3' in str(i) + str(j) + str(k):
                count += 1

print(count)