package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
//        return super.getCharge(daysRented);
        double result = 2;
        if (daysRented > 2)
            result += (daysRented -2) * 1.5;
        return result;
    }
    /**
     * 终于对抽象类的用法有了点感觉了。原来如此呀！！！
     */
}
