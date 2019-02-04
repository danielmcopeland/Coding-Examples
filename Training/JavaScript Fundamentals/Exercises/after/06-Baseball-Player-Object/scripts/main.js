/**
 * Constructor of a Baseball Player object
 * @param name String with the name of the player
 */
function BaseballPlayer(name) {
    this.name = name;
    this.successfulBattingAttempts = 0;
    this.strikes = 0;
}

BaseballPlayer.prototype.hit = function () {
    if (Math.random() >= 0.5) {
        this.successfulBattingAttempts++;
    } else {
        this.strikes++;
    }
};

BaseballPlayer.prototype.getSucccessfulBattingAttempts = function () {
    return this.successfulBattingAttempts;
};

BaseballPlayer.prototype.showSuccessfulBattingAttempts = function () {
    console.log(this.name + ": " + this.successfulBattingAttempts + " hits");
};

// Creating instances and running them
var matt = new BaseballPlayer("Matt");
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