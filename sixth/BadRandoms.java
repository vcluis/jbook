import java.util.Random;

public class BadRandoms{
    public static Random r = new Random();
    public static void main(String[] args){
        /*
        int[] values = new int[6];
        values[0] = 1 + r.nextInt(2);
        values[1] = 1 + r.nextInt(100);
        values[2] = r.nextInt(9 + 1);
        values[3] = 1000 + r.nextInt(1112 + 1);
        values[4] = -1 + r.nextInt(1 + 1);
        values[5] = -3 + r.nextInt(11 + 3);
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
        */
        // 1 <= n <= 2
        System.out.println(1 + r.nextInt(2));
        // 1 <= n <= 100
        System.out.println(1 + r.nextInt(100));
        // 0 <= n <= 9
        System.out.println(r.nextInt(9 + 1));
        // 1000 <= n <= 1112
        System.out.println(1000 + r.nextInt(1112 - 1000));
        // -1 <= n <= 1
        System.out.println(-1 + r.nextInt(1 + 1));
        // -3 <= n <= 11
        System.out.println(-3 + r.nextInt(11 + 3));
    }
}
