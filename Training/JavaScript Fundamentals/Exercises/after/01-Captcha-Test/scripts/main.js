function generateRandomIntegerUnder100 (positiveInteger) {
    return Math.round(Math.random() * 99);
}

var firstInteger = generateRandomIntegerUnder100();
var secondInteger = generateRandomIntegerUnder100();

var promptMessage = "How much is " + firstInteger + " + " + secondInteger + "?";
var expectedResult = firstInteger + secondInteger;

var inputNumber = null;
var isFirstTry = true;
// Repeat the prompt till the user enters the expected result
// Exact inequality (!== vs. !=) is not used in this comparison, since the expected result is a number, but the user input is a String
while (inputNumber != expectedResult) {

    // If the user doesn't confirm the input, he will try again
    var userConfirmed = false;
    while(!userConfirmed) {
        var inputNumber = prompt(promptMessage);
        userConfirmed = confirm("Are you sure " + firstInteger + " + " + secondInteger + " equals " + inputNumber + "?");
    }

    // If it is the first try, update the prompt message for any other try
    if(isFirstTry) {
        isFirstTry = false;
        promptMessage = "That's not correct. " + promptMessage;
    }
}

console.log("Human user identified");

