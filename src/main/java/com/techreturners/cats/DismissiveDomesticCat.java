package com.techreturners.cats;

public class DismissiveDomesticCat extends DomesticCat{
    public DismissiveDomesticCat(){}

    public String eat(){
        return "It will do I suppose";
    }

    public static void main(String[] args) {

        //created an array of domestic cats.  Some of them are dismissive.
        //when they eat, some of them say PUrrrrrr.
        //some of them say "It will do I suppose.
        // actual outputs are as follow:
//        Purrrrrrr
//        Purrrrrrr
//        It will do I suppose
//        Purrrrrrr
//        It will do I suppose
//        Purrrrrrr
//        It will do I suppose
//        Purrrrrrr
//        Purrrrrrr
//        Purrrrrrr




        DomesticCat[] domesticCats = new DomesticCat[] {
                                     new DomesticCat(),
                                     new DomesticCat(),
                                     new DismissiveDomesticCat(),
                                     new DomesticCat(),
                                     new DismissiveDomesticCat(),
                                     new DomesticCat(),
                                     new DismissiveDomesticCat(),
                                     new DomesticCat(),
                                     new DomesticCat(),
                                     new DomesticCat()
        };
        for(DomesticCat cat: domesticCats)
            System.out.println(cat.eat());
    }
}

