package characters.ricks;

import characters.Person;
import props.IProp;

import java.util.ArrayList;

public class Rick extends Person {

    public Job job;
    ArrayList<IProp> props;

    public Rick(String name, int healthValue, Job job, ArrayList<IProp> props) {
        super(name, healthValue);
        this.job = job;
        this.props = props;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public ArrayList<IProp> getProps() {
        return props;
    }

    public void setProps(ArrayList<IProp> props) {
        this.props = props;
    }

    public void addProp(IProp prop){
        props.add(prop);
    }
}
