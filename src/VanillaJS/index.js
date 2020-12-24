const calculator = {
    plus: function(a, b){
        return a + b;
    },
    minus: function substract(a,b){
        return a-b;
    },
    multiply: function multiple(a,b){
        return a*b;
    },
    divide: function divide(a,b){
        return a/b;
    },
    exponentiation: function expo(a,b){
        return a**b;
    },
    remainder: function remainder(a,b){
        return(a%b)
    }
}

const plus = calculator.plus(5, 5);
const minus = calculator.minus(5, 5);
const multiply = calculator.multiply(5, 5);
const divide = calculator.divide(5, 5);
const exponentiation = calculator.exponentiation(5, 5);
const remainder = calculator.remainder(5, 5);

console.log(plus);
console.log(minus);
console.log(multiply);
console.log(divide);
console.log(exponentiation);
console.log(remainder);