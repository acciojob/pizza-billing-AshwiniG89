package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            int vegPizza =300;
            this.price= price+vegPizza;
           // System.out.println("Base Price Of The Pizza: "+vegPizza);
        }else{
            int nonVegPizza =400;
            this.price= price+nonVegPizza;
            //System.out.println("Base Price Of The Pizza: "+nonVegPizza);
        }
     }

    public int getPrice(){
        System.out.print("Base Price Of The Pizza: ");
        return this.price;
    }

    public void addExtraCheese(){
        int cheese=80;
        this.price= price+cheese;
       // System.out.println("Extra Cheese Price = "+cheese);
    }

    public void addExtraToppings(){
        int vegTopping = 70;
        int nonVegTopping = 120;
        if(isVeg==true){
            this.price=price+vegTopping;
            System.out.println("Extra Topping For Veg Pizza = "+vegTopping);
        }else{
            this.price=price+120;
            System.out.println("Extra Topping For Non-Veg Pizza = "+nonVegTopping);
        }
    }

    public void addTakeaway(){
        int bag=20;
        this.price=price+bag;
        System.out.println("Paper bag Price = "+bag);
    }

    public String getBill(){
       // System.out.println();

        return "Total Price: "+price;
    }
}
