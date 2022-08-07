/**
 * References will be always modified by functions (by reference)
 * Primitive types will not be modified (by value)
 *
 **/
public class Reference{
    public static void main(String[] args){
        int value = 0;
        Example e = new Example();
        changeInt(value);
        System.out.println("Value in main: " + value);
        System.out.println("Class original value: " + e.value);
        changeClassByInstance(e);
        System.out.println("After change class by instance value: " + e.value);
        changeClassByMethod(e);
        System.out.println("After change class by method value: " + e.value);
        System.out.println();
        int[] elements = {1, 2, 3, 4, 5};
        System.out.println("arr original and arr after changeArr(int[] arr)");
        printArr(elements);
        changeArr(elements);
        printArr(elements);
        System.out.println("arr original and arr after changeInt(int value)");
        printArr(elements);
        changeInt(elements[0]);
        printArr(elements);
    }

    public static void changeInt(int value){
        value = 5;
        System.out.println("change int by function: " + value);
    }

    public static void changeClassByInstance(Example e){
        e.value = 15;
        System.out.println("Change class by instance: " + e.value);
    }

    public static void changeClassByMethod(Example e){
        e.setValue(10);
        System.out.println("Change class by method: " + e.value);
    }

    public static void printArr(int[] arr){
        System.out.printf("[");
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + ", ");
        }
        System.out.printf("]");
        System.out.println();
    }

    public static void changeArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] += 1;
        }
    }
}

class Example{
    public int value;

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
