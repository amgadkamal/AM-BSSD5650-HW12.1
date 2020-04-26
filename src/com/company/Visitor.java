package com.company;

public interface Visitor {

    public String visit(Liquor liquorItem);
    public String visit (Necessity necessaryItem);
    public String visit (Tobacco tobaccoItem);


}
