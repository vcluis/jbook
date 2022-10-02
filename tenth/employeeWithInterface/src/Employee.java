public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String secureNumber;

    public Employee(String firstName, String lastName, String secureNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.secureNumber = secureNumber;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSecureNumber(){return secureNumber;}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSecureNumber(String secureNumber){
        this.secureNumber = secureNumber;
    }

    @Override
    public String toString(){
        return String.format(
                "First name: %s\nLast name: %s\nSecure number: %s\n",
                firstName,
                lastName,
                secureNumber
            );
    }

    public abstract double income();
}
