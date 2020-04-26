package com.company;

public class TaxBreakVisitor implements Visitor {

    @Override
    public String visit(Liquor liquorItem) {
        double taxAmount = 0.005;
        System.out.println("Liquor item  with tax break");
        double basePrice = liquorItem.getPrice();
        String descriptioN = liquorItem.getDescription();
        System.out.println((basePrice+(taxAmount*basePrice))+"  "+descriptioN);
        return String.valueOf(basePrice+(taxAmount*basePrice));
    }

    @Override
    public String visit(Necessity necessaryItem) {
        double taxAmount = 0.002;
        System.out.println("Necessity item with tax break");
        double basePrice = necessaryItem.getPrice();
        String descriptioN = necessaryItem.getDescription();
        System.out.println((basePrice+(taxAmount*basePrice))+"  "+descriptioN);
        return String.valueOf(basePrice+(taxAmount*basePrice));

    }

    @Override
    public String visit(Tobacco tobaccoItem) {
        double taxAmount = 0.001;
        System.out.println("Tobacco item  with tax break");
        double basePrice = tobaccoItem.getPrice();
        String descriptioN = tobaccoItem.getDescription();
        System.out.println((basePrice+(taxAmount*basePrice))+"  "+descriptioN);
        return String.valueOf(basePrice+(taxAmount*basePrice));
    }


}
