/**
 * Function that finds and returns the biggest positive divisor of the given positive integer
 */
function findBiggestDivisor (positiveInteger) {
    console.log("Finding the biggest divisor of: " + positiveInteger);
    // Check that the given parameter is actually a positive integer
    if(!(positiveInteger > 0)) {
        console.log("The given parameter is not a positive integer");
        return NaN; // Return exits the function, so if this was executed, no more code inside this function will run
    }

    // We start searching the divisors from the given number-1 to find the biggest ones
    // We keep trying till we get down to the trivial divisor 1
    for (var i = positiveInteger - 1; i > 1; i--) {
        // Dividing the given number by the divisor has a remainder of zero. So the modulo operation returns zero.
        if((positiveInteger % i) === 0) {
            // When we find the biggest positive divisor, return it, so we exit the function and stop executing the rest of it
            return i;
        }
        // If we didn't find the number yet, the loop will execute again, this time trying with a smaller number (i--, which is equal to writing i = i - 1)
    }

    // If we found no results, the given number has no positive, non-trivial divisors. Return NaN
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

