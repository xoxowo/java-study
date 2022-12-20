num_1, num_2 = map(int, input().split())
list_a = list(map(int, input().split()))
tmp = []

for i in list_a :
    tmp.append(i)
    

print(tmp)
print(tmp[num_2] - tmp[num_1-1])

