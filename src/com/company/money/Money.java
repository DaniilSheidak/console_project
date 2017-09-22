package com.company.money;

/**
 * Created by Daniil Sheidak on 22.09.2017.
 */
public class Money {

    public static final int DEFAULT_EXCHANGE_RATE = 2;

    protected int value;

    public Money (int value){
        this.value = value;
    }


    public int getValue (){
        return value;
    }

    public int convertInDollars (){
        return value * DEFAULT_EXCHANGE_RATE;

    }
}
