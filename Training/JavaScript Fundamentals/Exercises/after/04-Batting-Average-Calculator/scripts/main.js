/**
 * Function that calculates the batting average
 * @param strikes Array with Boolean values. True represents a strike, while false is not a strike (and hence, assumed a hit.)
 * @returns Number with the batting average of the player
 */
function calculateBattingAverage (strikes) {
    if(!strikes) {
        console.log("Invalid data provided " + strikes);
        return 0;
    }

    var numberOfAttempts = strikes.length;
    var successfulHits = 0;
    for(var i = 0; i < numberOfAttempts; i++) {
        var isCurrentAttemptStrike = strikes[i];
        if(!isCurrentAttemptStrike) {
            successfulHits++;
        }
    }

    var battingAverage = successfulHits / numberOfAttempts;
    return battingAverage;
}

// Test it with these values
var exampleStrikes = [true, true, false, true, false, true, true, true, true, false, false, true, true, true, true];
console.log(calculateBattingAverage(exampleStrikes)); // returns 0.26666666666666666

