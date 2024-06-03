// const user = 'John'; // Error because of Declaration

(function () {
    const user = 'John';
    console.log(user);
    const hello = () => console.log('Hello from the IIFE');
    hello()
})();

// hello() // Error : You can't call dunction out of scope

(function (name) {
    console.log('Hello ' + name);
})('Shawn');

(function hello() {
    console.log('Hello');
})();


