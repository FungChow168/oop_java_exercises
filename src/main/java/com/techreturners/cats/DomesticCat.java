package com.techreturners.cats;

public class DomesticCat extends Cat{

    public DomesticCat(){
        this.averageHeight = 23;
    }

    @Override
    public String eat() {
        return  "Purrrrrrr";
    }

    @Override
    public String run() {
       return "Domestic cat is running swiftly";
    }
}
