from random import randint
import time
from timeit import repeat
from collections import deque
arr = [randint(0, 1000) for i in range(1000_000)]
list = deque([randint(0, 1000) for i in range(1000_000)])

for i in range(3):
    
    start_time = time.perf_counter()
    b = arr[740000]
    end_time = time.perf_counter() 
    # print("b=",b)
    timearray = end_time - start_time
    print(f"{timearray = :0.10f}")
    
    start_time1 = time.perf_counter()
    a = list [740000]
    end_time1 = time.perf_counter() 
    # print("a=", a)
    timelist = end_time1 - start_time1
    print(f"{timelist = :0.10f}")



# def insertion_sort(array):
#     # Loop from the second element of the array until
#     # the last element
#     for i in range(1, len(array)):
#         # This is the element we want to position in its
#         # correct place
#         key_item = array[i]

#         # Initialize the variable that will be used to
#         # find the correct position of the element referenced
#         # by `key_item`
#         j = i - 1

#         # Run through the list of items (the left
#         # portion of the array) and find the correct position
#         # of the element referenced by `key_item`. Do this only
#         # if `key_item` is smaller than its adjacent values.
#         while j >= 0 and array[j] > key_item:
#             # Shift the value one position to the left
#             # and reposition j to point to the next element
#             # (from right to left)
#             array[j + 1] = array[j]
#             j -= 1

#         # When you finish shifting the elements, you can position
#         # `key_item` in its correct location
#         array[j + 1] = key_item

#     return array

# arrayforsort = [5, 3, 1, 4, 3]
# print(insertion_sort(arrayforsort))
