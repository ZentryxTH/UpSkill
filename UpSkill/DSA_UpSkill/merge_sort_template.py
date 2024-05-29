sample_list1 = [45, 23, 87, 12, 32, 4]
sample_list2 = [94, 58, 79, 55, 95, 32, 46, 90, 76, 13]
sample_list3 = [ 1,  2,  3,  4,  5, 99, 98, 97, 96, 95, 30, 31, 32, 33, 34, 
                55, 56, 57, 58, 59, 88, 86, 84, 82, 80, 77, 75, 73, 71, 69,
                44, 46, 48, 50, 52, 17, 18, 19, 20, 21, 29, 28, 27, 26, 25, 
                 6,  7,  8,  9, 10]


def merge(S1, S2, S): #combine
  """Merge two sorted Python lists S1 and S2 into properly sized list S."""
  result = []
  i = j = 0
  while i < len(S1) and j < len(S2) : # i is left and j is right
    if S1[i] < S2[j] :
      result.append(S1[i]) 
      i += 1
    else :
      result.append(S2[j])
      j += 1
  
  result.extend(S1[i:])
  result.extend(S2[j:])
  return result

def merge_sort(S):
  """Sort the elements of Python list S using the merge-sort algorithm."""
  if len(S) <= 1 :
    return S


  # divide
  mid = len(S) // 2
  S1 = S[:mid] #left side
  S2 = S[mid:] #right side
  print(f"Divide {S} into {S1} and {S2}")

  
  # conquer (with recursion)
  sortedS1 = merge_sort(S1)
  sortedS2 = merge_sort(S2)  



  # combine
  output = merge(sortedS1,sortedS2,S) #recursion
  print(f"Combine {sortedS1} and {sortedS2} to {output} ")
  return output

print(f"Unsorted (sample_list 1) : {sample_list1}")
print(f"Merge sorted (sample_list1) : {merge_sort(sample_list1)}")
