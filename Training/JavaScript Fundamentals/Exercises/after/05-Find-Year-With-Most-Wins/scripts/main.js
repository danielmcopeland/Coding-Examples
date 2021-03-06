/**
 * Function that finds the year with most wins and prints to the console the year, the number of wins, and the place
 * @param statsByYear Object with years as keys, and stats objects as values (which contain the following properties: wins, loses and place)
 */
function logYearWithMostWins(yearlyStats) {
    if (!yearlyStats) {
        console.log("No valid stats provided.");
        return;
    }

    var yearWithMostWins = 0;
    var winsInBestYear = 0;
    var placeInBestYear = 0;

    for(var year in yearlyStats) {
        var winsInYear = yearlyStats[year].wins;
        if(winsInYear > winsInBestYear) {
            yearWithMostWins = year;
            winsInBestYear = winsInYear;
            placeInBestYear = yearlyStats[year].place;
        }
    }

    if(yearWithMostWins === 0) {
        console.log("No best year could be found in the provided stats");
    } else {
        console.log("The year with most wins was " + yearWithMostWins
            + " with " + winsInBestYear + " victories, and the finishing place was "
            + placeInBestYear);
    }
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
        wins: 88,
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

logYearWithMostWins(cardinalStats); // Logs "The year with most wins was 2015 with 100 victories, and the finishing place was 1"

