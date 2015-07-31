package com.glf.elit.origin;

/**
 * Created by guoliufang on 30/7/15.
 */
public class Movie {
    public static final int CHILDRENDS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    private Price _price;
    public Movie(String title, int priceCode){
        _title = title;
        set_priceCode(priceCode);//初始化的时候，就可以设定他的类型。。
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCode() {
        return _price.getPriceCode();
    }

    public void set_priceCode(int arg) {
        switch (arg){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENDS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");

        }
    }

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }
}
