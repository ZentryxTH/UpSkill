const x = 100;
const foo = 1;
var bar = 2;

if (true) {
    const y = 200;
    console.log(x + y);
}

// console.log(x + y); // Error

for (let i = 0; i <= 10; i++){
    console.log(i);
}

// console.log(i); // Error

if (true) {
    const a = 500;
    let b = 600;
    var c = 700; // var is not block scope
}

// Use var in block

console.log(c);

function run() {
    var d = 100;
    console.log(d);
}

run();

// console.log(d); // Error 