package com.example.layeredarchitecture.dao;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * @author nvn
 * @created 12/22/2023 - 7:52 PM
 */
public class Test {
    public static void main(String[] args) {
        double x=12356.254;
        String text= String.valueOf(x);
        System.out.println(String.format("%,.2f", x).replace(","," ").replace(".",",")+"€");
        //System.out.println(text);
    }

    public static void printCurrency(double currencyAmount, String outputCurrency) {
        Locale locale;

        if (outputCurrency.equals("Yen")) {
            locale = new Locale("jp", "JP");
        } else if(outputCurrency.equals("Euros")) {
            locale = new Locale("de", "DE");
        } else if (outputCurrency.equals("Dollars")) {
            locale = new Locale("en", "US");
        } else {
            locale = new Locale("en", "US");
        }

        Currency currency = Currency.getInstance(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        System.out.println(currency.getDisplayName() + ": " + numberFormat.format(currencyAmount));

    }
}
