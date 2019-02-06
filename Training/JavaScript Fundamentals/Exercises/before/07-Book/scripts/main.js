/**
 * Constructor of a Book object
 */
// Your code goes here
class Book {
    constructor() {
        this.pages = [];
    }
    
    addPage(page) {
        this.pages.push(page);
    }

    countOccurrences(word) {
        let count = 0;
        let thesePages = this.pages;
        thesePages.forEach(page => {
            count += this.countOccurrencesInPage(page, word);
        })
        
        return count;
    }

    countOccurrencesInPage(page, word) {
        let regex = new RegExp('\\b'+word+'\\b', 'gmi');
        let wordArray = page.match(regex);
        if (wordArray == null) {
            wordArray = [];
        }
        return wordArray.length;
    }

    logAllText() {
        this.pages.forEach(page => console.log(page));
    }
}

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
