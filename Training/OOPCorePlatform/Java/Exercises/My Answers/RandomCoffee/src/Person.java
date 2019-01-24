public class Person {
    private String name;
    private String email;
    private String[] history = new String[3];

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String[] getHistory() {
        return history;
    }

    public void addNewHistory(String newHistory) {
        this.history[2] = this.history[1];
        this.history[1] = this.history[0];
        this.history[0] = newHistory;
    }
}
