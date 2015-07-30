package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public double getCharge() {
        double result = 0;
        //determine amounts for each line
        switch (get_movie().get_priceCode()){
            case Movie.REGULAR:
                result +=2;
                if (get_daysRented() > 2)
                    result += (get_daysRented() -2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += get_daysRented() * 3;
                break;
            case Movie.CHILDRENDS:
                result += 1.5;
                if (get_daysRented() >2)
                    result += (get_daysRented() -3) * 1.5;
                break;
        }//switch
        return result;
    }
}
