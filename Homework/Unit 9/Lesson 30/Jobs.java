public class Jobs {
    public static void main(String[] args) {
        Employie j=new Employie("John", 10000);
        Maniger m=new Maniger("Fred", 10000, 1000);
        Executive e=new Executive("Eng", 600000, 100000, 5000);
        System.out.printf("%10s's salery is %,10.2f$ with an anual income of %,10.2f$%n",j.getName(),j.getSalary(),j.getAnnualIncome());
        System.out.printf("%10s's salery is %,10.2f$ with an anual income of %,10.2f$%n",m.getName(),m.getSalary(),m.getAnnualIncome());
        System.out.printf("%10s's salery is %,10.2f$ with an anual income of %,10.2f$%n",e.getName(),e.getSalary(),e.getAnnualIncome());

    }
}
