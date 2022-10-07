
package Asignment;

import java.util.Scanner;

public class Person {
String name,address,mobileno;
int age;

public Person(String name,int age,String mobileno,String  address){
    this.name=name;
    this.age=age;
    this.address=address;
    this.mobileno=mobileno;
    
}
public Person(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the person detail");
    System.out.println("Enter the name");
    name=sc.nextLine();
    System.out.println("Enter the age");
    age=Integer.parseInt(sc.nextLine());
    System.out.println("Enter the mobileno");
    mobileno= sc.nextLine();
    System.out.println("address");
    address=sc.nextLine();
    
}

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", age=" + age + ", mobileno=" + mobileno + '}';
    }
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p);
        Person p1=new Person("Sourav", 34, "88888","varanasi");
        System.out.println(p1);
    }

}
