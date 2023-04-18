import java.io.*;
import java.util.Scanner;
class Prog29_P1_1{
    // driver method
    public static void main(String[] args){
        // Variable price_gas is assigned the cost of gas.
        // Cost of gas is $4 per gallon which is converted to cents.
        // Thus cost of gas becomes 400.0 cents
        // Car maintenance cost is 5 cents per mile.
        // Variable car_maintain is assigned the car maintenance cost.
        // Both the variables price_gas and car_maintain are made final
        // so that the values are assigned to them only once.
        final double price_gas = 400.0;
        final double car_maintain = 5.0;
        // Scanner class is used to take inputs from user.
        // The values of train ticket, distance from home to work and
        // fuel efficiency of the car are taken from user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the one way train ticket price in dollars");
        double train_fare = sc.nextDouble();
        System.out.println("Enter the distance from home to work");
        double dist = sc.nextDouble();
        System.out.println("Enter the fuel efficiency of the car");
        double fuel_eff = sc.nextDouble();
        // The cost by train is calculated by train fare times 100 in cents.
        // It is then multiplied by 2 to get the cost for the two way journey
        // from home to work place and again back to home.
        double train_cost = 2*train_fare*100;
        // The cost by car is calculated by adding the car maintenance cost for
        // the miles travelled and the price of gas per fuel efficiency
        // for the miles travelled.
        // It is then multiplied by 2 to get the cost for the two way journey
        // from home to work place and again back to home.
        double car_cost = 2*car_maintain*dist + 2*dist*price_gas/fuel_eff;
        // Cost of commute by car and train are compared.
        // The one with less cost is chosen and displayed
        if(train_cost < car_cost)
            System.out.println("Train is cheaper");
        else
            System.out.println("Car is cheaper");
    }
}