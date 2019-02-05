/**
 * Function that finds and returns the biggest positive divisor of the given positive integer
 */
function findBiggestDivisor (positiveInteger) {
    let input = Math.abs(positiveInteger);
    for(i=input-1; i>0; i--) {
        if(i==1) { return NaN; }
        if(input%i == 0) { return i ;}
    }
}

function findAllDivisors (positiveInteger) {
    let input = Math.abs(positiveInteger);
    let outputArray = [];
    for(i=input-1; i>1; i--) {
        if(input%i == 0) {
            outputArray.push(i);
        }
    }
    return outputArray;
}

function submitAnswer() {
    let input = document.getElementById("userInput").value;
    document.getElementById("output1").innerHTML = "Largest factor is: "+findBiggestDivisor(input);
}

function submitAnswer2() {
    let input = document.getElementById("userInput2").value;
    document.getElementById("output2").innerHTML = "Factors are: "+htmlFormat(findAllDivisors(input));
}

function htmlFormat(arr) {
    let output = "";
    arr.forEach(num => {output+=(num + ", ")});
    return output.substring(0,output.length-2);
}