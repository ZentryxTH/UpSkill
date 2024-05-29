from typing import Any

class HashSet:

    def __init__(self, size: int) -> None:
        self.size = size
        self.values = [None] * size

    def print_table(self) -> None:
        for i in range(self.size):
            print('index:', i, 'value:', self.values[i])

    def hash_function(self, key: int) -> int:
        return key % self.size

    def put(self, key: int) -> None:
        index = self.hash_function(key)
        if self.values[index] is None or self.values[index] == key:
            self.values[index] = key
        else:
            raise KeyError("Hash Collision")

    def get(self, key: int, default: Any = None) -> Any:
        index = self.hash_function(key)
        if self.values[index] == key:
            return self.values[index]
        elif self.values[index] is None or self.values[index] != key :
            return default
        else:
            raise KeyError("No Hash Collision")

    def delete(self, key: int) -> int:
        index = self.hash_function(key)
        if self.values[index] is None:
            raise KeyError("Key not found")
        elif self.values[index] == key:
            temp = self.values[index]
            self.values[index] = None
            return temp
        else:
            raise KeyError("No Hash Collision")

    def intersection(self, other):
        intersect = HashSet(min([self.size, other.size]))
        for i in self.values:
            if i in other.values and i is not None:
                intersect.put(i)
        return intersect

    def union(self, other):
        union = HashSet(max([self.size, other.size]))
        for i in self.values:
            if i is not None :
                union.put(i)
        for i in other.values:
            if i not in union.values and not None :
                union.put(i)
        return union

if __name__ == '__main__':
    a = HashSet(10)  # for perfect hash
    a.put(1)
    a.put(2)
    a.put(3)
    a.put(4)
    b = HashSet(10)  # for perfect hash
    b.put(1)
    b.put(3)
    b.put(5)
    b.put(7)
    print('Intersection: ')
    c = a.intersection(b)
    c.print_table()
    print('Union: ')
    d = a.union(b)
    d.print_table()
