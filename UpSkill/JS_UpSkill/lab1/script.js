//This is a sigle line of code

console.log(100); /* Number console */

console.log('Hello World'); /* String console */

console.log(20, "Hello", true); //

const x = 100;

console.log(x);

console.error("Alert");

console.warn('Warning');

console.table({name: 'Brad', email: 'brad@gmail.com'});

console.group('simple');
console.log(x);
console.error("Alert");
console.warn('Warning');
console.groupEnd();

const styles = 'padding: 10px; background-color: white; color: green;';

console.log('%cHello World', styles);

/* ------------------------------------------------ */

// Variables
// Ways to declare a variable
// var , let , const

let firstName = 'Zen';
let lastName = 'Tryx';

console.log(firstName,lastName);

let age = 20;

console.log(age);

// Naming Convetions
// - Only letters, numbers, uderscores and dollar signs
// - Can't start with a number

// Multi-Word Formatting
// fistName = camelCase
// first_name = underscore
// FirstName = PascalCase
// firstname = lowercase

// Re-assigning Variables
age = 31;

console.log(age);

let score = 1;

console.log(score);

if (true){
    score = score+1;
}

console.log(score);

const y = 100; // const variable can't re-assign

const arr =  [1,2,3,4]

arr.push(5);

console.log(arr);

const person = {
    name: 'Zen'
};

person.name = 'Jo';

person.email = 'jo@gmail.com'

console.log(person);

// Declare multiple values at once
let a, b, c;

const d = 10, e = 20, f = 30;

console.log(a); // undefined
console.log(d);

// Primaitive data types
/*
    - String : Sequence of characters. Must be in quotes or backticks
    - Number : Integers as well as floating-point numbers
    - Boolean : Logical entity / true or false
    - Null - Intentional absence of any object value
    - Undefined : A Variable that has not yet been defined / assigned
    - Symbol : Built-in object whose constructor return a unique symbol
    - BigInt : Numbers that are greater than the "Number" type can handle
*/

// String
const femaleName = 'Sara';
// Number
const aged = 30;
const temp = 98.9;

// Boolean
const hasKid = true;

// Null
const aptNumber = null;

// Undefined // Must use let for undefined
// let ss;
const ss = 11;

// Symbol
const id = Symbol('id');

// BigInt
const n = 9007199254740991n;

// Reference Types
const numbers = [1,2,3,4];

const persons = {
    name: 'Fred'
};

function sayHello(){
    console.log('Hello');
}

const output = sayHello;

console.log(output, typeof output);

// Values are stored on the stack

const name = 'Jame';
const old = 30;

// Reference values are stored on the heap

const personss = {
    name: 'Zero',
    age: 40,
}

let newName = name;
newName = 'Johnathan'

let newPerson = personss
newPerson.name = 'Jojo'

console.log(name, newName);
console.log(person, newPerson);

/*-------------------------------------------------------------------------------------*/

// Conversion

let amount = 'hello';

// Cahnge string to number
amount = parseInt(amount); // NaN is not a number but it is special number represent.
// amount = +amount;
// amount = Number(amount);

// Change number to string
// amount = amount.toString();
// amount = String(amount);

// Convert string to decimal
// amount = parseFloat(amount);

// Convert number to boolean
// amount = Boolean(amount);
console.log(Math.sqrt(-1));
console.log(1+NaN);
console.log(undefined + undefined);
console.log('foo' / 3);

console.log(amount, typeof amount);

/*---------------------------------------------------------------------------------------------------------*/

// 1. Artithmetic Operators

let z;
z = 5 + 5;
z = 5 - 5;
z = 5 * 5;
z = 5 / 5;
z = 7 % 5;

// Concatenation
z = 'Hello' + ' ' + 'World'

// Exponent
z = 2 ** 3;

// Increment
z = 1;
// z = z + 1
z++;

// Decrement
// z = z - 1;
z-- ;

// Assignment Operators
z = 10;

z += 5;
z -= 5;
z *= 5;
z /= 5;
z %= 5;

// 3. Comparison Operators

// z = 2 == '2';
// z = 2 === '2';
z = 2 != '2';
z = 2 !== 2;
z = 10 > 5;
z = 10 < 5;
z = 10 >= 5;
z = 10 <= 5;

console.log(z);

/*------------------------------------------------------------------------------------------------------------*/

// Type coercion

let i;

i = 5 + '5';

i = 5 + Number('5');

i = 5 * '5';

i = 5 + null;

i = Number(null);

i = Number(true);
i = Number(false);

i = 5 + true;

i = 5 + false;

i = 5 + undefined;

console.log(i, typeof i);