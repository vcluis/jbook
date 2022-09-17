public class EmployeeBasePlusComission extends EmployeeByComission{
    private double baseSalary;

    public EmployeeBasePlusComission(String firstName, String lastName, String secureNumber, double weeklySales, double salesComission, double baseSalary){
        super(firstName, lastName, secureNumber, weeklySales, salesComission);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary needs to be > 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary(){return baseSalary;}

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary needs to be > 0.0");

        this.baseSalary = baseSalary;
    }
    
    @Override
    public double income(){
        return super.income() + getBaseSalary();
    }

    @Override
    public String toString(){
        return String.format(
                "%s %s; %s: $%,.2f",
                "With base salary",
                super.toString(),
                "Base salary",
                getBaseSalary()
            );
    }
}
