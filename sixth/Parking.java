import java.util.Scanner;

public class Parking{
    public static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args){
        int hours = 0;
        System.out.println("Enter hours");
        hours = read.nextInt();
        double amount = getAmount(hours);
        System.out.println("Parking: " + hours + " hours. Amount: $" + amount);
    }

    public static double getAmount(int hours){
        double amount = 0;
        switch(hours){
            case 1:
                amount = 2;
            case 2:
                amount = 2;
            case 3:
                amount = 2;
                break;
            default:
                amount = 0;
        }
        if(hours >= 24) amount = 10;
        if(amount == 0){
            int tempHours = hours - 3;
            amount = 2;
            amount += tempHours * 0.5;
        }
        return amount;
    }
}
