sample_list0 = [85, 24, 63, 45, 17, 31, 96, 50]
sample_list1 = [45, 23, 87, 12, 32, 4, 54, 32, 52]
sample_list2 = [94, 58, 79, 55, 95, 32, 46, 90, 76, 13]
sample_list3 = [ 1,  2,  3,  4,  5, 99, 98, 97, 96, 95, 30, 31, 32, 33, 34, 
                55, 56, 57, 58, 59, 88, 86, 84, 82, 80, 77, 75, 73, 71, 69,
                44, 46, 48, 50, 52, 17, 18, 19, 20, 21, 29, 28, 27, 26, 25, 
                 6,  7,  8,  9, 10]

def partition(unsorted_array, first_index, last_index):
    pivot = unsorted_array[first_index]
    j = first_index 
    k = last_index
    while j < k :
        while unsorted_array[j] < pivot :
            j += 1
        while unsorted_array[k] > pivot :
            k -= 1
        unsorted_array[j], unsorted_array[k] = unsorted_array[k], unsorted_array[j]

        if j > k :
            unsorted_array[k] , unsorted_array[first_index] = unsorted_array[first_index] , unsorted_array[k]
    return k
        
        

def quick_sort_rec(unsorted_array, first, last):
    if first < last :
        pivot = partition(unsorted_array,first,last)
        quick_sort_rec(unsorted_array , first , pivot - 1)
        quick_sort_rec(unsorted_array , pivot + 1 , last)


def quick_sort(unsorted_array) :
    quick_sort_rec(unsorted_array , 0 , len(unsorted_array) - 1)
    return unsorted_array    

print(quick_sort(sample_list0))

