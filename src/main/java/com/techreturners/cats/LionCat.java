package com.techreturners.cats;

public class LionCat extends Cat{
    public LionCat(){
        this.averageHeight = 1100;
        this.setting = "wild";
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public String run() {
        return "Lion cat is running fast";
    }
}
