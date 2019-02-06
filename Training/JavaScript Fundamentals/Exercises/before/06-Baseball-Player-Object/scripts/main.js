/**
 * Constructor of a Baseball Player object
 * @param name String with the name of the player
 */
// Your code goes here
class BaseballPlayer {
    constructor(name) {
        this.name = name;
        this.successfulBattingAttempts = 0;
        this.strikes = 0;
    }
    
    hit() {
        let a = Math.round(Math.random());
        console.log(a);
        if(a==1) { this.strikes++; }
        else { this.successfulBattingAttempts++; }
    }

    getSuccessfulBattingAttempts() {
        return this.successfulBattingAttempts;
    }
    showSuccessfulBattingAttempts() {
        let attempts = this.getSuccessfulBattingAttempts();
        console.log(this.name + ": " + attempts + " hits");
    }

}

// Creating instances and running them
var matt = new BaseballPlayer("Matt");
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();
matt.hit();



var greg = new BaseballPlayer("Greg");
greg.hit();
greg.hit();
greg.hit();
greg.hit();

matt.showSuccessfulBattingAttempts(); // In my case, it logged: Matt: 3 hits
greg.showSuccessfulBattingAttempts(); // In my case, it logged: Greg: 2 hits