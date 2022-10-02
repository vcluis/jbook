public class ComissionEmployee extends Employee{
    private double weeklySales;
    private double salesComission;

    public ComissionEmployee(String firstName, String lastName, String secureNumber, double weeklySales, double salesComission){
        super(firstName, lastName, secureNumber);

        if(weeklySales < 0.0)
            throw new IllegalArgumentException("Weekly sales must be > 0.0");

        if(salesComission < 0.0)
            throw new IllegalArgumentException("Sales comission must be > 0.0");

        this.weeklySales = weeklySales;
        this.salesComission = salesComission;
    }
    
    public double getWeeklySales(){return weeklySales;}
    public double getSalesComission(){return salesComission;}

    public void setWeeklySales(double weeklySales){
        if(weeklySales < 0.0)
            throw new IllegalArgumentException("Weekly sales must be > 0.0");
        this.weeklySales = weeklySales;
    }

    public void setSalesComission(double salesComission){
        if(salesComission < 0.0)
            throw new IllegalArgumentException("Sales comission value must be > 0.0");
        this.salesComission = salesComission;
    }

    @Override
    public double income(){
        return getSalesComission() * getWeeklySales();
    }

    @Override
    public String toString(){
        return String.format(
                "%s: %s\n%s: $%,.2f; %s: %.2f",
                "Employee by comission:",
                super.toString(),
                "Weekly sales",
                getWeeklySales(),
                "Sales comission",
                getSalesComission()
            );
    }

    @Override
    public double getPaymentAmount(){
        return income();
    }

}
