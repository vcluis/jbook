public class Main{
    public static void main(String[] args){
        EmployeeWithSalary employeeWithSalary =
            new EmployeeWithSalary("Elvis", "Velasquez", "1", 800);
        EmployeePerHours employeePerHours =
            new EmployeePerHours("Resorte", "Velasquez", "2", 16.5, 56);
        EmployeeByComission employeeByComission =
            new EmployeeByComission("Princesa", "Velasquez", "3", 10000, .06);
        EmployeeBasePlusComission employeeBasePlusComission =
            new EmployeeBasePlusComission("Cats", "Velasquez", "4", 5000, .04, 300);

        System.out.println("Processing employees");

        System.out.printf("%s\n%s: $%,.2f\n\n", employeeWithSalary, "income", employeeWithSalary.income());
        System.out.printf("%s\n%s: $%,.2f\n\n", employeePerHours, "income", employeePerHours.income());
        System.out.printf("%s\n%s: $%,.2f\n\n", employeeByComission, "income", employeeByComission.income());
        System.out.printf("%s\n%s: $%,.2f\n\n", employeeBasePlusComission, "income", employeeBasePlusComission.income());

        Employee[] employees = new Employee[4];
        employees[0] = employeeWithSalary;
        employees[1] = employeePerHours;
        employees[2] = employeeByComission;
        employees[3] = employeeBasePlusComission;

        System.out.println("Processing employees with polimorphism");
        
        for(Employee current: employees){
            System.out.println(current);

            if(current instanceof EmployeeBasePlusComission){
                EmployeeBasePlusComission employee = (EmployeeBasePlusComission) current;
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
