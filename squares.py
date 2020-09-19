def F(a, n):
    if n==0:
        return(1, a)
    else:
        b = 1
        for i in range(2*n):
            b = b*a
            print(b)
        (u, v) = F(a, n-1)
        return (u*b/a, v*b*a)

a = 4
print(F(a, 2))