public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String secureNumber, double weeklySalary){
        super(firstName, lastName, secureNumber);
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary needs to be > 0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double income(){
        return getWeeklySalary();
    }

    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("Salary Employee: %s\n%s: $%,.2f", super.toString(), "Weekly salary", getWeeklySalary());
    }
}
