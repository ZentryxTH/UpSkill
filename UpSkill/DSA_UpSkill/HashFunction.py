def simple_folding(key : str, s:int) : # key ค่าที่รับเข้า s คือ size
    ascii  = ord(key[0])
    for i in key[1:] :
        ascii += ord(i)
    return ascii % s
# print(simple_folding("CATS", 300))
# print(simple_folding("DOGS", 300))

def simple_foldingint(key : int, s: int) :
    sum = 0
    power = len(str(key)) - 1
    for i in str(key) :
        sum += int(i)*(10**power)
        power -= 1
    return sum % s

# print(simple_foldingint(7456,10))

