package com.techreturners.cats;

abstract class Cat {

    boolean isAsleep = false;
    int averageHeight = 0;
    String setting = "domestic";

    public abstract String eat();
    public abstract String run();
    public boolean isAsleep(){
        return isAsleep;
    }

    public void goToSleep(){
        isAsleep = true;
    }

    public void wakeUp() {
        isAsleep = false;
    }

    public String getSetting(){
        return setting;
    }

    public int getAverageHeight(){
        return averageHeight;
    }

}


