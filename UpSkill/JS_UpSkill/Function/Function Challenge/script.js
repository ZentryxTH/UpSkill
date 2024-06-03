// Challenge 1 : get cellsius
const getCellsius = (f) => console.log(`The temperture is ${(f - 32) * (5 / 9)} \xB0C`);

getCellsius(32)

// Challenge 2 : min max in array
function minMax(arr) {
    const min = Math.min(...arr);
    const max = Math.max(...arr);
    return {
        min,
        max,
    };
}

console.log(minMax([1, 2, 3, 4, 5]));


// Challenge 3 : IIFE

(function (length, width) {
    const area = length * width;
    console.log(`The area of a rectangle with a length of ${length} and a width of ${width} is ${area}`);
})(10, 5);

// Any Solution
((length, width) => {
    const area = length * width;

    const output = `The area ofa rectangle with a length of ${length} and a width of ${width} is ${area}`;
    console.log(output);
})(10, 5);