package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}