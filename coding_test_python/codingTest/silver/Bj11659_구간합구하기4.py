
a, b = map(int, input().split())
numbers = list(map(int, input().split()))
sum_arr = [0]
tmp = 0

for i in numbers:
    tmp = tmp + i
    sum_arr.append(tmp)

for i in range(b):
    x,y = map(int, input().split())
    print(sum_arr[y] - sum_arr[x - 1])