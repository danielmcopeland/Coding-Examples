/**
 * Function that validates the provided email address by making sure that it contains:
 * At least an "@"
 * At least a "." after the "@"
 * @param emailAddress String with the given email address
 * @returns Boolean true if the given email address is valid, false otherwise
 */
function isEmailValid (emailAddress) {
    if(!emailAddress) {
        console.log("Invalid, empty address provided");
        return false;
    }

    var atSymbolPosition = emailAddress.indexOf("@");
    if(atSymbolPosition === -1){
        console.log(emailAddress + " is an invalid email address: no @ found");
        return false;
    }

    var dotSymbolPosition = emailAddress.lastIndexOf(".");
    if(dotSymbolPosition === -1) {
        console.log(emailAddress + " is an invalid email address: no . found");
        return false;
    }

    if(dotSymbolPosition <= atSymbolPosition) {
        console.log(emailAddress + " is an invalid email address: no . found after the @");
        return false;
    }

    // If all the validations passed, we consider the address valid
    console.log(emailAddress + " is VALID");
    return true;
}

// Test it with these values
console.log(isEmailValid("invalidEmail.com")); // false
console.log(isEmailValid("invalidEmail@domain")); // false
console.log(isEmailValid("invalid.Email@domain")); // false
console.log(isEmailValid("validEmail@example.com")); // true

