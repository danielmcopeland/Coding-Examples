# Scoring Bowling
Determines the total score of a standard round of bowling.

## Table of Contents

* [Dependencies](#dependencies)
* [Running the Tests](#running-the-tests)
* [How to Score Bowling](#how-to-score-bowling)
* [Exercises](#exercises)

## Dependencies
What you need:
* [UnitTest](https://docs.python.org/3/library/unittest.html)

## Running the Tests
Open a terminal and ensure your working directory is the root of the project (the directory containing this README). To run all unit tests, enter:

```bash
python -m unittest 
```

To run a specific unit test from the TestGame class, enter:

```bash
python -m unittest test.test_game.TestGame.<insert-test-name-here>
```


## How to Score Bowling
The game consists of 10 frames.  In each frame the player has
two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll.

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled.

In the tenth frame a player who rolls a spare or strike is allowed to roll extra
balls as needed to complete the frame.  If a spare is made with the first two rolls,
one extra ball is rolled. If a strike is made on the first roll, two extra balls are 
rolled. 


## Exercises
Write unit tests that will support the following scenarios:  
1. A gutter game
2. A game of all ones
3. A game with one spare
4. A game with one strike
5. A perfect game

### Note:
 The template is setup for an object oriented paradigm, but feel free to write a functional program and accompanying unit tests if desired. The code for a functional paradigm will likely end up simpler for these exercises, but it will also use less of the features of unittest. 
