
public class User {
    private String name;
    private int score;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public User() {

    }

    public void increaseScoreByOne() {
        this.score++;
        // (or this.setScore(this.score + 1);
    }
}
