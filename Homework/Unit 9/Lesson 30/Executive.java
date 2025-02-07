
public class Executive extends Maniger{
    private double shares;
    public Executive(String name, double salary, double bonis, double shares) {
        super(name, salary, bonis);
        this.shares=shares;
    }
    public double getShares(){
        return shares;
    }
    public double getAnnualIncome() {
        double temp = getSalary()+bonis+shares;
        return temp;
    }

    
}
