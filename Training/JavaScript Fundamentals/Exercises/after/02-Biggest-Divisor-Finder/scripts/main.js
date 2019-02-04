/**
 * Function that finds and returns the biggest positive divisor of the given positive integer
 */
function findBiggestDivisor (positiveInteger) {
    console.log("Finding the biggest divisor of: " + positiveInteger);
    if(!(positiveInteger > 0)) {
        console.log("The given parameter is not a positive integer");
        return NaN;
    }

    for (var i = positiveInteger - 1; i > 1; i--) {
        if((positiveInteger % i) === 0) {
            return i;
        }
    }

    console.log("No non-trivial divisors found for " + positiveInteger + ". It is a prime number.");
    return NaN;
}

// Test it with different values
console.log(findBiggestDivisor(4));
console.log(findBiggestDivisor(125));
console.log(findBiggestDivisor(7));
console.log(findBiggestDivisor(49));
console.log(findBiggestDivisor(1024));
console.log(findBiggestDivisor(377));

