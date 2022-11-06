
# def TowerOfHanoi(n, from_rod, to_rod, aux_rod):
#     if n == 0:
#         return
#     TowerOfHanoi(n-1, from_rod, aux_rod, to_rod)
#     print("Move disk", n, "from rod", from_rod, "to rod", to_rod)
#     TowerOfHanoi(n-1, aux_rod, to_rod, from_rod)
 
 
# # Driver code
# N = 3
 
# # A, C, B are the name of rods
# TowerOfHanoi(N, 'A', 'C', 'B')
 
# # Contributed By Harshit Agrawal


def insertion_sort(array):
    # Loop from the second element of the array until
    # the last element
    for i in range(1, len(array)):
        # This is the element we want to position in its
        # correct place
        key_item = array[i]

        # Initialize the variable that will be used to
        # find the correct position of the element referenced
        # by `key_item`
        j = i - 1

        # Run through the list of items (the left
        # portion of the array) and find the correct position
        # of the element referenced by `key_item`. Do this only
        # if `key_item` is smaller than its adjacent values.
        while j >= 0 and array[j] > key_item:
            # Shift the value one position to the left
            # and reposition j to point to the next element
            # (from right to left)
            array[j + 1] = array[j]
            j -= 1

        # When you finish shifting the elements, you can position
        # `key_item` in its correct location
        array[j + 1] = key_item

    return array

# arr = [2, 1, 4, 0]
from random import randint
import time
from timeit import repeat

def run_sorting_algorithm(algorithm, array):
    # Set up the context and prepare the call to the specified
    # algorithm using the supplied array. Only import the
    # algorithm function if it's not the built-in `sorted()`.
    setup_code = f"from __main__ import {algorithm}" if algorithm != "sorted" else ""

    stmt = f"{algorithm}({array})" # insertion_sort([0, 1, 2, 3, 4])

    # Execute the code ten different times and return the time
    # in seconds that each execution took
    times = repeat(setup=setup_code, stmt=stmt, repeat=3, number=10)

    # Finally, display the name of the algorithm and the
    # minimum time it took to run
    print(f"Algorithm: {algorithm}. Minimum execution time: {min(times)}")

if __name__ == "__main__":
    # Generate an array of `ARRAY_LENGTH` items consisting
    # of random integer values between 0 and 999

    # Call the function using the name of the sorting algorithm
    # and the array we just created
    # run_sorting_algorithm(algorithm="insertion_sort", array=arr)
    for i in range(10):
        arr = [randint(0, 1000) for i in range(999)]
        start_time = time.time()
        insertion_sort(arr)
        end_time = time.time()
        print(end_time - start_time)
