/**
 * Function that calculates the batting average
 * @param strikes Array with Boolean values. True represents a strike, while false is not a strike (and hence, assumed a hit.)
 * @returns Number with the batting average of the player
 */
function calculateBattingAverage (strikeArray) {
    let hits = 0;
    strikeArray.forEach(swing => {
        if(swing == "Hit") {
            hits++;
        }
    })
    battingAvg = hits/strikeArray.length;
}

function updateScore() {
    document.getElementById("strikeArray").innerHTML = htmlFormat(batArray);
    calculateBattingAverage(batArray);
    document.getElementById("battingAvg").innerHTML = battingAvg;
}

let batArray = []
let battingAvg;

function addStrike() {
    batArray.push("Strike");
    updateScore();
}

function addHit() {
    batArray.push("Hit");
    updateScore();
}

function clearArray() {
    batArray=[];
    updateScore();
}

function htmlFormat(arr) {
    let output = "";
    arr.forEach(num => {output+=(num + ", ")});
    return output.substring(0,output.length-2);
}

// Test it with these values
var exampleStrikes = [true, true, false, true, false, true, true, true, true, false, false, true, true, true, true];
console.log(calculateBattingAverage(exampleStrikes)); // returns 0.26666666666666666

