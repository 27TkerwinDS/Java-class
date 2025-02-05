public class Maniger extends Employie{
    double bonis;
    public Maniger(String name, double salary,double bonis){
        super(name, salary);
        this.bonis=bonis;
    }
    public double getAnnualIncome() {
        // Employees only get an annual salary.
        double temp = getSalary()+bonis;
        return temp;
    }
}
