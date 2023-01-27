package characters.ricks;

import characters.Person;
import props.IProp;

public class Rick extends Person {

    public Job job;
    public IProp prop;

    public Rick(String name, int healthValue, Job job, IProp prop) {
        super(name, healthValue);
        this.job = job;
        this.prop = prop;
    }

    public Rick(String name, int healthValue, IProp prop) {
        super(name, healthValue);
        this.prop = prop;
    }

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
