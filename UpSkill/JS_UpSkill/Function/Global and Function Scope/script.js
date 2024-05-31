// alert('Hello');
// console.log(innerWidth);

const x = 100; // Global scope

console.log(x, 'in global');

function run(){
    console.log(window.innerHeight);
    console.log(x, 'in function');
    // console.log(y); // Error
}

run();

if (true){
    console.log(x, 'in block');
}

function add(){
    const x = 1; //  Overwriting
    const y = 50;
    console.log(x + y);
}

// console.log(y); // Error

add();
