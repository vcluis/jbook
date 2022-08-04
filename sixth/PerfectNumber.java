import java.util.*;

public class PerfectNumber{
    public static void main(String[] args){
        System.out.println("Perfect number between 0 and 1000");
        for(int i = 1; i <= 1000; i++){
            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }

    public static List<Integer> getDivisors(int number){
        List<Integer> divisors = new ArrayList<Integer>();
        for(int i = 1; i < number;i++){
            if(number % i == 0) divisors.add(i);
        }
        return divisors;
    }

    public static int sumDivisors(List<Integer> divisors){
        int total = 0;
        for(int i = 0; i < divisors.size(); i++)
            total += divisors.get(i);
        return total;
    }

    public static boolean isPerfect(int number){
        List<Integer> divisors = getDivisors(number);
        int result = sumDivisors(divisors);
        if(number == result) return true;
        return false;
    }
}
