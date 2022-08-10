public class ExceptedThree{
    public static void main(String[] args){
        int[] elements = new int[3];
        try{
            for(int i = 0; i <= elements.length; i++)
                System.out.println(elements[i]);
        } catch (ArrayIndexOutOfRangeException e){
            // this exeption is not treaten like others exeptions, it is treaten like a code error
            System.out.println(e);
        }
    }
}
