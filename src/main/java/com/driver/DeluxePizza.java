package com.driver;

public class DeluxePizza extends Pizza {

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);//parent class constructor

        addExtraCheese();
        addExtraToppings();
    }

}
