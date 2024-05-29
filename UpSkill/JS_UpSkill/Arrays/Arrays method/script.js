let x;

const arr = [34, 55, 95, 20, 15];

// arr.push(100); // add 100 in last index of array

// arr.pop() // delete item in last index of array

// arr.unshift(99); // add 99 in first index of array

// arr.shift(); // delete item in first index of array

// arr.reverse(); // reverse array

x = arr.includes(20); // check item in index of array

x = arr.indexOf(34);

x = arr.slice(1, 4);

// x = arr.splice(1, 4);

// x = arr.splice(3, 1);

x = arr.splice(1, 4).reverse().toString().charAt(0);

console.log(x, arr);

