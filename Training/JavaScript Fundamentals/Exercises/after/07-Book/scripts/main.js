/**
 * Constructor of a Book object
 */
function Book() {
    this.pages = [];
}

Book.prototype.addPage = function(page) {
    this.pages.push(page);
};

// Utility function for readability purposes
Book.prototype.countOccurrencesInPage = function(pageContents, word) {
    var occurrencesInPage = 0;
    var wordsInPage = pageContents.split(" ");
    var totalWordsInPage = wordsInPage.length;
    for(var i = 0; i < totalWordsInPage; i++) {
        var currentWord = wordsInPage[i];
        if(currentWord.toLowerCase() === word.toLowerCase()) {
            occurrencesInPage++;
        }
    }
    return occurrencesInPage;
};

Book.prototype.countOccurrences = function(word) {
    var totalOccurrences = 0;
    var numberOfPages = this.pages.length;
    for(var i = 0; i < numberOfPages; i++) {
        var pageContents = this.pages[i];
        totalOccurrences += this.countOccurrencesInPage(pageContents, word);
    }
    return totalOccurrences;
};

Book.prototype.logAllText = function () {
    var allText = "";
    var numberOfPages = this.pages.length;
    for(var i = 0; i < numberOfPages; i++) {
        var pageContents = this.pages[i];
        allText += " " + pageContents;
    }
    console.log(allText);
};


// Creating an instance
var lordOfTheRings = new Book();
lordOfTheRings.addPage("Upon great pedestals founded in the deep waters stood two great kings of stone");
lordOfTheRings.addPage("The left hand of each was raised palm outwards in gesture of warning");
lordOfTheRings.addPage("Great power and majesty they still wore the silent wardens of a long-vanished kingdom");

lordOfTheRings.logAllText();
console.log("The word 'king' appears " + lordOfTheRings.countOccurrences("king") + " times");
// Logs: "The word 'king' appears 0 times"
console.log("The word 'great' appears " + lordOfTheRings.countOccurrences("great") + " times");
// Logs: "The word 'great' appears 3 times"
