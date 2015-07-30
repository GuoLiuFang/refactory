package com.glf.elit.origin;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by guoliufang on 30/7/15.
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String getName(){
        return _name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();

            //add frequent renter points
            frequentRenterPoints ++;
            //add bonus for a two day new release rental
            if ((each.get_movie().get_priceCode() == Movie.NEW_RELEASE) && each.get_daysRented() > 1) frequentRenterPoints++;
            //show figures for this rental
            result += "\t" + each.get_movie().get_title() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }//while
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + "frequenct renter points";

        return result;
    }

}
