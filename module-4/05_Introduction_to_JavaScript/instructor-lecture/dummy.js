console.log('this is log statement');

/*
  Multiline comment
*/

//single line comments

//let allows us to change the value of the variable later (should be our second choice).
let someNumber = 2;
console.log(someNumber);

someNumber = "2";
console.log(someNumber);

//const allows us to create a constant (should be our first choice)
const someOtherNumber = 3;
console.log(someOtherNumber);
const sum = someOtherNumber + 5;

// NEVER USE var!!! Ever ever ever!!!!! Ever in case I wasn't clear

//console.log(abc);   //example of null (abc was never defined anywhere so no variable and no value!)
let abcd;
console.log(abcd);   // example of undefined (we have a variable defined, but value is undefined)

//NaN - Not a Number
let nanEx = '5';
console.log(Number.parseInt(nanEx));   // this IS a number. ParseInt converts String to number

nanEx = 'ABC'
console.log(Number.parseInt(nanEx));  // this will give us a NaN value

const av = 5;
const aw = '5'

if (av == aw) {   //loose equality checks for value only, not the underlying datatype
    console.log('These are equal')
}

if (av === aw) {   //strict equality checks for value AND underlying datatypes
    console.log('These are NOT equal')
}

let names = ['steve', 'bob', 'george', 'jorie'];
console.log(names);
console.log(names.length);


//push adds to the END of the array
names.push('trenton');
names.push('jacob');
names.push('lyndsey', 'greg');
console.log(names);

//removes from the ENDof the array
const endOfArray = names.pop();
console.log(endOfArray);
console.log(names);

//add to the FRONT of the array
names.unshift('bill');
console.log(names);

//remove from the front of the array
const frontOfArray = names.shift();
console.log(frontOfArray);
console.log(names);

const specificArrayPlace = names.slice(2);
console.log(specificArrayPlace);
console.log(names);

const elementAtTwo = names[2];
console.log(elementAtTwo);

console.log(names.indexOf('jacob'));

for (let i=0; i < names.length; i++) {
    console.log(names[i]);
}

const listOfNames = names.join(',');
console.log(listOfNames);

console.log(names.reverse());

const student = {
    fname: 'steve',
    lname: 'c',
    occupation: 'Evil Venmo Chief Technologist',
    address: {
        streetNumber: '123 Main Street',
        city: 'Powell'
    }
}

//dot notation
console.log(student.fname);
console.log(student.address.city);

function addTwoNumbers(num1, num2) {
    return Number.parseInt(num1) + Number.parseInt(num2);
}

console.log(addTwoNumbers(2,'3'));

const sum2 = addTwoNumbers;
console.log(sum2(1,2));