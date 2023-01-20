package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese = 80;
    private int toppings;
    boolean isExtraCheese;
    boolean isExtraTopping;
    boolean isTakeAway;
    boolean isBillGenerated;
  //  this.bill ="";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraTopping = false;
        this.isBillGenerated = false;

        if(isVeg==true){
            this.price =300;
            this.toppings= 70;
            System.out.println("Base Price Of The Pizza: "+price);
        }else{
            this.price =400;
            this.toppings= 120;
            System.out.println("Base Price Of The Pizza: "+price);
        }
     }

    public int getPrice(){
       // System.out.print("Base Price Of The Pizza: ");
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheese){
            this.price = this.price+cheese;
            this.isExtraCheese = true;
        }
       // System.out.println("Extra Cheese Price = "+cheese);
    }

    public void addExtraToppings(){
        if(!isExtraTopping){
            this.price=price+toppings;
          this.isExtraTopping= true;
        }
    }

    public void addTakeaway() {
        if (!isTakeAway) {
            this.price = price + 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
       if(!isBillGenerated){
           if(isExtraCheese){
              // this.bill = "Etra Cheese "+this.cheese+"\n";
               System.out.println("Extra Cheese Added: "+cheese);
           }
           if(isExtraTopping){
              // this.bill = "Etra top "+this.cheese+"\n";
               System.out.println("Extra Toppings Added: "+toppings);
           }
           if(isTakeAway){
              // this.bill = "Bag "+this.cheese+"\n";
               System.out.println("Paperbag Added: "+20);
           }
       }
       this.bill="Total Price: "+price+"\n";
       this.isBillGenerated = true;

        return this.bill;
    }
}
