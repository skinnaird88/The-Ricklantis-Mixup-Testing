package characters.ricks;

import characters.Person;

public class Rick extends Person {

    public String job;

    public Rick(String name, int healthValue, String job) {
        super(name, healthValue);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
