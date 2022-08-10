public class ExceptedTwo{
    public static void main(String[] args){
        int[] elements = new int[3];
        try{
            for(int i = 0; i <= elements.length; i++)
                System.out.println(elements[i]);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
