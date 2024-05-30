/* Object Literals */
// A common data structure that hold key/value pairs.

/*
         const person ={
       |     name: 'John',       |
keys   |     age: 30,            | values
       |     location: 'LA',     |
         };
*/

let x;

const person = {
    name: 'John',
    age: 30,
    isAdmin: true,
    address: {
        street: '123 main street',
        city: 'LA',
        state: '-',
    },
    hobbies: ['music', 'sports']
};

x = person.name;
x = person['age'];
x = person.address.street;
x = person.hobbies[1];

// Update Properties
person.name = 'Jane';
person['isAdmin'] = false;

delete person.age;

person.hasChildren = true;

person.greet = function(){
    console.log(`Hello, my name is ${this.name}`);
}

person.greet(); 

const person2  = {
    'first name': 'Sirawit',
    'last name': 'Bunnam',
}

x = person2['first name']

console.log(x);