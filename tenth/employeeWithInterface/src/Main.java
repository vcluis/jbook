public class Main{
    public static void main(String[] args){
        SalariedEmployee salariedEmployee =
            new SalariedEmployee("Elvis", "Velasquez", "1", 800);
        HourlyEmployee hourlyEmployee =
            new HourlyEmployee("Resorte", "Velasquez", "2", 16.5, 56);
        ComissionEmployee comissionEmployee =
            new ComissionEmployee("Princesa", "Velasquez", "3", 10000, .06);
        BasePlusComissionEmployee basePlusComissionEmployee =
            new BasePlusComissionEmployee("Cats", "Velasquez", "4", 5000, .04, 300);

        System.out.println("Processing employees");

        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "income", salariedEmployee.income());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "income", hourlyEmployee.income());
        System.out.printf("%s\n%s: $%,.2f\n\n", comissionEmployee, "income", comissionEmployee.income());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusComissionEmployee, "income", basePlusComissionEmployee.income());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;

        System.out.println("Processing employees with polimorphism");
        
        for(Employee current: employees){
            System.out.println(current);

            if(current instanceof BasePlusComissionEmployee){
                BasePlusComissionEmployee employee = (BasePlusComissionEmployee) current;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.println("New salary with 10% of increase: " + employee.getBaseSalary());
            }
            
            System.out.printf("Income $%,.2f\n\n", current.income());
        }

        for(int i = 0; i < employees.length; i++){
            System.out.printf("The employee %d is a %s\n", i, employees[i].getClass().getName());
        }

    }
}
