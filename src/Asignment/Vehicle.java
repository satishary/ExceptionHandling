package Asignment;

import java.util.Scanner;

public class Vehicle {

    String fueltype, usedorunused, importedormadeinindia, vehicletype, vehiclename;
    int noofwheels;

    public Vehicle(String fueltype, String usedorunused, String importedormadeinindia, String vehicletype, String vehiclename, int noofwheels) {
        this.fueltype = fueltype;
        this.usedorunused = usedorunused;
        this.importedormadeinindia = importedormadeinindia;
        this.vehicletype = vehicletype;
        this.vehiclename = vehiclename;
        this.noofwheels = noofwheels;
    }

    public Vehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vehicle details");
        System.out.println("Enter the Vehicletype");
        vehicletype = sc.nextLine();
        System.out.println("Enter the vehiclename");
        vehiclename = sc.nextLine();
        System.out.println("Enter the no.of wheels");
        noofwheels = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the fueltype");
        fueltype = sc.nextLine();
        System.out.println("Enter the usedorunused");
        usedorunused = sc.nextLine();
        System.out.println("Enter the importedormadeinindia");
        importedormadeinindia = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Vehicle{" + "fueltype=" + fueltype + ", usedorunused=" + usedorunused + ", importedormadeinindia=" + importedormadeinindia + ", vehicletype=" + vehicletype + ", vehiclename=" + vehiclename + ", noofwheels=" + noofwheels + '}';
    }

    public static void main(String args[]) {
        Vehicle ducattibike = new Vehicle("Petrol", "Used", "Imported", "Bike", "Ducatti", 2);
        System.out.println(ducattibike);
        Vehicle hondaaccord = new Vehicle("desile", "not used", "india", "car", "honda accord", 4);
        System.out.println(hondaaccord);
        Person p = new Person("Sourabh", 34, "87987898", "Mumbai");
        System.out.println(p);

    }

}
