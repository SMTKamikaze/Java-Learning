n=int(4321234)
d=n
a=int(1)
while a<=4:
    d=n
    while int(d>0):
        if int(d%10)==a:
            print(a, end="")
        else:
            print(" ",end="")   
        d=d/10
    a+=1 
    print("")