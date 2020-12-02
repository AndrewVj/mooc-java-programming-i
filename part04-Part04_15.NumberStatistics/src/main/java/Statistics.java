
public class Statistics {
    
    private int Sum;
    private int count;
    
    public Statistics() {
        this.Sum = 0;
        this.count = 0;
    }
    
    public void addNumber(int number) {
        this.Sum = this.Sum + number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.Sum;
    }
    
    public double average() {
        if(this.count == 0) {
            return 0;
        }
        return this.Sum/(double)this.count;
    }
}
