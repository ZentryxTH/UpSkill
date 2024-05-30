<<<<<<< Updated upstream
// Challenge 1

const arr1 = [1, 2, 3, 4, 5];

// arr1.reverse();
// arr1.push(0);
// arr1.unshift(6);

// arr1.push(6);
// arr1.unshift(0);
// arr1.reverse();

// Result: [6, 5, 4, 3, 2, 1, 0]

// Challenge 2

const arr2 = [5, 6 , 7, 8, 9, 10];

let arr3;
// Solution 1
arr3 = arr1.slice(0, 4).concat(arr2);

// Solution 2
arr3 = [...arr1, ...arr2];
arr3.splice(4, 1);


=======
// Challenge 1

const arr1 = [1, 2, 3, 4, 5];

// arr1.reverse();
// arr1.push(0);
// arr1.unshift(6);

// arr1.push(6);
// arr1.unshift(0);
// arr1.reverse();

// Result: [6, 5, 4, 3, 2, 1, 0]

// Challenge 2

const arr2 = [5, 6 , 7, 8, 9, 10];

let arr3;
// Solution 1
arr3 = arr1.slice(0, 4).concat(arr2);

// Solution 2
arr3 = [...arr1, ...arr2];
arr3.splice(4, 1);


>>>>>>> Stashed changes
console.log(arr3);