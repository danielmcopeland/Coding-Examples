class Game:
    def __init__(self):
        self.rolls = []
    
    def roll(self, pins):
        self.rolls.append(pins)
    
    def score(self):
        score = 0
        i = 0
        for _ in range(10):
            next_two = self.rolls[i] + self.rolls[i+1]
            score += next_two
            if (next_two >= 10):
                score += self.rolls[i+2]
            i += 1 if self.rolls[i] == 10 else 2
        return score
