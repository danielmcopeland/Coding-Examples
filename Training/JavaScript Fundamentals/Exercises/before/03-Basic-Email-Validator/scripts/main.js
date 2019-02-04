/**
 * Function that validates the provided email address by making sure that it contains:
 * At least an "@"
 * At least a "." after the "@"
 * @param emailAddress String with the given email address
 * @returns Boolean true if the given email address is valid, false otherwise
 */
function isEmailValid (emailAddress) {
    // Your code goes here
}

// Test it with these values
console.log(isEmailValid("invalidEmail.com")); // false
console.log(isEmailValid("invalidEmail@domain")); // false
console.log(isEmailValid("invalid.Email@domain")); // false
console.log(isEmailValid("validEmail@example.com")); // true

