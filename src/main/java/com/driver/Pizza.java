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
            this.bill+="Base Price Of The Pizza: "+price+"\n";
        }else{
            this.price =400;
            this.toppings= 120;
            this.bill+="Base Price Of The Pizza: "+price+"\n";
        }
        this.cheese=80;
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
       if(!isBillGenerated){
           if(isExtraCheese){
               this.bill += "Extra Cheese Added: "+this.cheese+"\n";
               //System.out.println("Extra Cheese Added: "+cheese);
           }
           if(isExtraTopping){
               this.bill += "Extra Toppings Added: "+this.toppings+"\n";
               //System.out.println("Extra Toppings Added: "+toppings);
           }
           if(isTakeAway){
               this.bill += "Paperbag Added: "+20+"\n";
              // System.out.println("Paperbag Added: "+20);
           }
       }
       this.bill+="Total Price: "+price+"\n";
       this.isBillGenerated = true;

        return this.bill;
    }
}
