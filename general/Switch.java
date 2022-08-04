public class Switch{
    public static void main(String[] args){
        int n = 1;
        switch(n){
            case 1:
                System.out.println("number 1");
            case 2:
                System.out.println("number 2");
            case 3:
                System.out.println("number 3");
            default:
                System.out.println("number default");
                //break; // No break is needed in default case
        }
    }
}
