
public class HealthStation {

    private int noOfWeighs;
    
    public HealthStation() {
        this.noOfWeighs = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.noOfWeighs++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings() {
        return this.noOfWeighs;
    }
}
