

exercise = [13, 3, 64, 19, 23, 73, 6 ,12, 84]
sample_list1 = [45, 23, 87, 12, 32, 4]
sample_list2 = [94, 58, 79, 55, 95, 32, 46, 90, 76, 13]
sample_list3 = [ 1,  2,  3,  4,  5, 99, 98, 97, 96, 95, 30, 31, 32, 33, 34, 
                55, 56, 57, 58, 59, 88, 86, 84, 82, 80, 77, 75, 73, 71, 69,
                44, 46, 48, 50, 52, 17, 18, 19, 20, 21, 29, 28, 27, 26, 25, 
                 6,  7,  8,  9, 10]

def bubble_sort(unordered_list):
    count = 0
    swap = 0
    compare = 0
    for i in range(len(unordered_list)) :
        swapped = False 
        for j in range(0, len(unordered_list) - i - 1) :
            compare += 1
            if unordered_list[j] > unordered_list[j+1] :
                temp = unordered_list[j]
                unordered_list[j] = unordered_list[j+1]
                unordered_list[j+1] = temp
                swapped = True
                swap += 1

        count += 1
        if not swapped :
            break
        print(f"bubble sort (end of round {count}) : {unordered_list}")
        print(f"Swapped : {swap}")
        print(f"Compared : {compare}")

def selection_sort(unordered_list):
    count = 0
    swap = 0
    compare = 0
    for i in range(len(unordered_list)) :
        swapped = False
        first = i
        min = 999999
        for j in range(i+1, len(unordered_list)) :
            compare += 1
            if unordered_list[j] < min :
                min = unordered_list[j]
                indexmin = j
        temp1 = unordered_list[first]
        temp2 = unordered_list[indexmin]
        unordered_list[first] = temp2
        unordered_list[indexmin] = temp1
        swapped = True
        swap += 1
        
        count += 1
        if not swapped :
            break
        print(f"selection sort (end of round {count}) : {unordered_list})")
        print(f"Swapped : {swap}")
        print(f"Compared : {compare}")


def insertion_sort(unordered_list):
    count = 0
    compare = 0
    copy = 0
    for i in range(1,len(unordered_list)) :
        count += 1
        key = unordered_list[i]
        sortindex = i - 1
        while sortindex >= 0 and key < unordered_list[sortindex] :
            copy += 1
            unordered_list[sortindex+1] = unordered_list[sortindex]
            sortindex -= 1
        unordered_list[sortindex+1] = key
        compare += 1
            
        print(f"insertion sort (end of round {count}) : {unordered_list}")
        print(f"Coppied : {copy}")
        print(f"Compared : {compare}")       

                



# print(f"Unsorted (sample_list1) : {sample_list1}")
# bubble_sort(sample_list1)
# print(f"Bubble sort (sample_list1) : {sample_list1}")

# print(f"Unsorted (exercise) : {exercise}")
# bubble_sort(exercise)
# print(f"Buble sort (exercise) : {exercise}")

# print(f"Unsorted (sample_list1) : {sample_list1}")
# selection_sort(sample_list1)
# print(f"Selection sort (sample_list1) : {sample_list1}")


# print(f"Unsorted (exercise) : {exercise}")
# selection_sort(exercise)
# print(f"Selsection sort (exercise) : {exercise}")

print(f"Unsorted (sample_list1) : {sample_list1}")
insertion_sort(sample_list1)
print(f"Insertion sort (sample_list1) : {sample_list1}")