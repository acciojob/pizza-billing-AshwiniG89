package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private int cheese ;
    private int toppings;
    boolean isExtraCheese;
    boolean isExtraTopping;
    boolean isTakeAway;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheese = false;
        this.isExtraTopping = false;
        this.isBillGenerated = false;
        this.isTakeAway = false;

        if(isVeg==true){
            this.price =300;
            this.toppings= 70;

        }else{
            this.price =400;
            this.toppings= 120;

        }
        this.cheese=80;
        this.bill+="Base Price Of The Pizza: "+price+"\n";
     }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheese){
            this.price = this.price + cheese;
            this.isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraTopping){
            this.price= this.price + toppings;
          this.isExtraTopping = true;
        }
    }

    public void addTakeaway() {
        if (!isTakeAway) {
            this.price = price + 20;
            this.isTakeAway = true;
        }
    }

    public String getBill(){
       if(!isBillGenerated) {
           if (isExtraCheese) {
               this.bill += "Extra Cheese Added: " + this.cheese + "\n";
           }
           if (isExtraTopping) {
               this.bill += "Extra Toppings Added: " + this.toppings + "\n";
           }
           if (isTakeAway) {
               this.bill += "Paperbag Added: " + 20 + "\n";
           }
           this.bill += "Total Price: " + price + "\n";
           this.isBillGenerated = true;
       }
        return this.bill;
    }
}
