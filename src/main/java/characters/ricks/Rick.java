package characters.ricks;

import characters.Person;

public class Rick extends Person {

    public Job job;

    public Rick(String name, int healthValue, Job job) {
        super(name, healthValue);
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
