public class AnotherMain{
    public static void main(String[] args){
        Payable[] payableObjects = new Payable[4];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375);
        payableObjects[1] = new Invoice("56789", "tire", 4, 19.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11", 800);
        payableObjects[3] = new SalariedEmployee("Lisa", "Trangay", "888-8", 1200);

        System.out.println("Invoices and employees processed polymorphically");

        for(Payable currentPayable : payableObjects){
            System.out.printf("\n%s\n%s: %,.2f\n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}
