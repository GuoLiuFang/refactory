package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
abstract class Price {
    abstract int getPriceCode();

    //昨天弄混乱了。这是getcharge那个函数是getPriceCode。。
    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()){
            case Movie.REGULAR:
                result +=2;
                if (daysRented > 2)
                    result += (daysRented -2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENDS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented -3) * 1.5;
                break;
        }
        return result;
    }
}
