public class EmployeePerHours extends Employee{
    private double salary;
    private double hours;

    public EmployeePerHours(String firstName, String lastName, String secureNumber, double salary, double hours){
        super(firstName, lastName, secureNumber);
        if(salary < 0.0)
            throw new IllegalArgumentException("Salary needs to be > 0.0");
        if(hours < 0.0)
            throw new IllegalArgumentException("Hours needs to be > 0.0");
        this.salary = salary;
        this.hours = hours;
    }

    public double getSalary(){return salary;}
    public double getHours(){return hours;}

    public void setSalary(double salary){
        if(salary < 0.0)
            throw new IllegalArgumentException("Salary needs to be > 0.0"); 
        this.salary = salary;
    }

    public void setHours(double hours){
        if(hours < 0.0)
            throw new IllegalArgumentException("Hours needs to be > 0.0");
        this.hours = hours;
    }
    
    @Override
    public double income(){
        if(getHours() <= 40)
            return getSalary() * getHours();
        else return 40 * getSalary() + (getHours() - 40) * getSalary() * 1.5;

    }

    @Override
    public String toString(){
        return String.format(
                "Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(),
                "Salary per hour",
                getSalary(),
                "Hours worked",
                getHours()
            );
    }
}
