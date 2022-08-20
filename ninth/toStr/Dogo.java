// This class will prove that a method who calls an instance
// will receive implicitly the return of a toString() method
// BUT if my class have no @Override the toString() method
// Tath method who calls will receive a default toString() method
// tath returns the class name

public class Dogo{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
}
