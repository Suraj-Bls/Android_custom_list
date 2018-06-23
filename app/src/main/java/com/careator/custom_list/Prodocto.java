package com.careator.custom_list;

/**
 * Created by ssv520 on 6/1/2018.
 */

public class Prodocto {

    private String title;
    private String descrpition;
    private String type;
    private double price;
    private boolean sale;

    public Prodocto(String title, String descrpition, String type, double price, boolean sale) {
        this.title = title;
        this.descrpition = descrpition;
        this.type = type;
        this.price = price;
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean getSale() {
        return sale;
    }
}
