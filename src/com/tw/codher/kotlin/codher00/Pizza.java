package com.tw.codher.kotlin.codher00;

public class Pizza {

    private String topping;
    private String cheese;
    private Double sauce;
    private String crust;

    public Pizza(String topping, String cheese, Double sauce, String crust) {
        this.topping = topping;
        this.cheese = cheese;
        this.sauce = sauce;
        this.crust = crust;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public Double getSauce() {
        return sauce;
    }

    public void setSauce(Double sauce) {
        this.sauce = sauce;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }
}
