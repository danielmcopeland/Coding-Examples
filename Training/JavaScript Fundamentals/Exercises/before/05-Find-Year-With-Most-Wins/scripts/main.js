/**
 * Function that finds the year with most wins and prints to the console the year, the number of wins, and the place
 * @param statsByYear Object with years as keys, and stats objects as values (which contain the following properties: wins, loses and place)
 */
function logYearWithMostWins(yearlyStats) {
    let yearArray = Object.keys(cardinalStats);
    console.log(yearArray);
    let highest = cardinalStats[yearArray[0]];
    console.log(highest);
    
    let highestVal =yearArray[0];
    for (i=0; i<yearArray.length; i++) {
        let year = yearArray[i];
        if(cardinalStats[year]["wins"] > highest["wins"]) {
            highest = cardinalStats[year];
            highestVal = year;
        }
    }
    console.log( `The year with most wins was ${highestVal} with ${highest.wins} victories, and the finishing place was ${highest.place}`);


}

    // Test it with these values
var cardinalStats = {
    2015: {
        wins: 100,
        loses: 62,
        place: 1
    },
    2014: {
        wins: 90,
        loses: 72,
        place: 1
    },
    2013: {
        wins: 97,
        loses: 65,
        place: 1
    },
    2012: {
        wins: 880,
        loses: 74,
        place: 2
    },
    2011: {
        wins: 90,
        loses: 72,
        place: 2
    },
    2010: {
        wins: 88,
        loses: 76,
        place: 2
    }
};

logYearWithMostWins(cardinalStats);// Logs "The year with most wins was 2015 with 100 victories, and the finishing place was 1"

