public class For{
    public static void main(String[] args){
        for(double k = 0.1; k != 1.0; k += 0.1){ // we can't use == or != in for statement
            System.out.println(k);
        }
    }
}
