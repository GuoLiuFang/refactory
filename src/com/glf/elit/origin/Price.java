package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
abstract class Price {
    abstract int getPriceCode();

    //昨天弄混乱了。这是getcharge那个函数是getPriceCode。。
    abstract double getCharge(int daysRented);
}
