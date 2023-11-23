package app.entities;


public class User {

    private String name;
    private String group;
    private String results;

    public double char_l;
    public double char_r;
    public double char_t;
    public double char_b;

    public User(String name, String group, String results)
    {
        this.name = name;
        this.group = group;
        this.results = results;
    }

    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name=name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
