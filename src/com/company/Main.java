package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();
        TaxBreakVisitor taxBreakVisitor = new TaxBreakVisitor();
        Necessity milk = new Necessity(5,"AVAILABLE");
        Tobacco smoke = new Tobacco(7,"AVAILABLE");
        Liquor blue = new Liquor(3,"AVAILABLE");

        Scanner newInput = new Scanner(System.in);
        String taxes;
        System.out.println("This transaction receives a tax break? yes or no");
        taxes = newInput.nextLine();
        if(taxes.equals("yes")) {
           double a = Double.valueOf(blue.accept(taxBreakVisitor))+Double.valueOf(milk.accept(taxBreakVisitor))+Double.valueOf(smoke.accept(taxBreakVisitor));
           System.out.println("total: "+ a);

        }else {

           double a = Double.valueOf(blue.accept(taxVisitor))+Double.valueOf(milk.accept(taxVisitor))+Double.valueOf(smoke.accept(taxVisitor));
           System.out.println("total: "+ a);

    }}
}
