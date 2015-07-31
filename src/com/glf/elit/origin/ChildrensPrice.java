package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENDS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented -3) * 1.5;
        return  result;

    }
}
