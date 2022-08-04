import java.util.*;

public class PrimeNumber{
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        /*
        System.out.println("Perfect number between 0 and 1000");
        for(int i = 2; i <= 10000; i++){
            if(isPrime(i)){
                System.out.println(i + " is Prime!!!");
            }
        }
        */
        System.out.println("Search prime numbers between 0 and ?");
        System.out.println("Enter your number:");
        int number = s.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 2; i <= number; i++){
            if(isPrime(i)){
                numbers.add(i);
            }
        }
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i) + " is prime!!!");
        }
        System.out.printf("There is a total of %d prime numbers between 0 and %d\n", numbers.size(), number);
    }

    public static boolean isPrime(int number){
        List<Integer> divisors = new ArrayList<Integer>();
        for(int i = 1; i <= number; i++){
            if(number % i == 0) divisors.add(i);
            if(divisors.size() > 2) return false;
        }
        /*
        System.out.printf("Divisors of %d\n", number);
        for(int i = 0; i < divisors.size(); i++){
            System.out.println(divisors.get(i));
        }
        System.out.println();
        */
        return true;
    }
}
