function generateRandomNumber() {
    return (Math.round(Math.random()*100));
};

let firstNum;
let secondNum;
let numSum;

function resetNums() {
    firstNum = generateRandomNumber();
    secondNum = generateRandomNumber();
    numSum = firstNum+secondNum;
    document.getElementById("addingNumber1").placeholder = firstNum;
    document.getElementById("addingNumber2").placeholder = secondNum;
}

window.onload = function() {
    resetNums();    
}

function submitAnswer() {
    let userIn = document.getElementById("userInput").value;
    console.log(userIn);
    let confirmMessage = `Are you sure ${firstNum}+${secondNum}=${userIn}?`;

    if(confirm(confirmMessage)) {
        if (userIn == numSum) {
            console.log('Correct!');
        }
        else {
            console.log(`Incorrect: ${firstNum}+${secondNum}=${numSum}`);
        }
    }

    
}