package com.techreturners.cats;

public class CheetahCat extends Cat{
    public CheetahCat(){
        this.averageHeight = 1300;
        this.setting = "wild";
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    @Override
    public String run() {
        return "CheetahCat is running super fast";
    }
}
