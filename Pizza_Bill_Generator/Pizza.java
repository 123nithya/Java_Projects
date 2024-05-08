package Pizza_Bill_Generator;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price+=extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price+=extraToppingsPrice;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price+=backPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Base Pizza Price : "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+= "Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra Toppings Added: "+extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+= "Take Away: "+backPackPrice+"\n";
        }
        bill+="Total Bill : "+this.price+"\n";
        System.out.println(bill);
    }
}

/*
* Base Pizza :  300
* Topping : 150
* Cheese : 100
* Take Away : 20

This is how it has to look like.
*/