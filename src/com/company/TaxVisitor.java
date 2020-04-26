package com.company;

public class TaxVisitor implements Visitor {

    @Override
    public String visit(Liquor liquorItem) {
        double taxAmount = 0.0538;
        System.out.println("Liquor item price with tax");
        double basePrice = liquorItem.getPrice();
        String descriptioN = liquorItem.getDescription();
        System.out.println((basePrice+(taxAmount*basePrice))+"  "+descriptioN);
        return String.valueOf(basePrice+(taxAmount*basePrice));
    }

    @Override
    public String visit(Necessity necessaryItem) {
        double taxAmount = 0.01;
        System.out.println("Necessity item price with tax");
        double basePrice = necessaryItem.getPrice();
        String descriptioN = necessaryItem.getDescription();
        System.out.println((basePrice+(taxAmount*basePrice))+"  "+ descriptioN);
        return String.valueOf(basePrice+(taxAmount*basePrice));

    }

    @Override
    public String visit(Tobacco tobaccoItem) {
        double taxAmount = 0.0621;
        System.out.println("Tobacco item price with tax");
        double basePrice = tobaccoItem.getPrice();
        String descriptioN = tobaccoItem.getDescription();
        System.out.println((basePrice+(taxAmount*basePrice))+"  "+descriptioN);
        return String.valueOf(basePrice+(taxAmount*basePrice));
    }


}
