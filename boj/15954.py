N,K = list(map(lambda x:int(x), input().split()))
dolls_like = list(map(lambda x : int(x), input().split()))

minimum = 99999999999999

for kk in range(K, N+1):
    for idx in range(kk, N+1):

        m = sum(dolls_like[idx-kk:idx])/kk
        v = 0
        for i in dolls_like[idx-kk:idx]:
            v += (i-m)**2
        b = (v / kk)**0.5

        if minimum > b:
            minimum = b


print(minimum)