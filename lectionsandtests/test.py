from random import randint
import time
from timeit import repeat
for i in range(3):
    arr = [randint(0, 1000000) for i in range(1000000)]
    start_time = time.time()
    b = arr[740000]
    end_time = time.time() 
    print("b=",b)
    timearray = end_time - start_time
    print(timearray)
    list = [randint(0, 1000000) for i in range(1000000)]
    start_time1 = time.time()
    a = list [740000]
    end_time1 = time.time() 
    print("a=", a)
    timelist = end_time1 - start_time1
    print(timelist)
