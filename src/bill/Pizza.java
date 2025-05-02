package bill;

import java.util.Scanner;

public class Pizza {

    protected int price;
    private boolean veg;

    protected int extraToppingPrice = 150;
    protected int extraCheesePrice = 100;
    protected int begPackPrice = 20;

    protected int basePizzaPrice;

    private boolean addExtraTopping = false;
    private boolean addExtraCheese = false;
    private boolean begPack = false;

    Scanner sc = new Scanner(System.in);
    public Pizza(boolean veg){
        this.veg = veg;

        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraTopping(){
        System.out.print("Do you want extra topping?(y/n): ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        switch (ch){
            case 'y':{
                addExtraTopping = true;
                this.price += extraToppingPrice;
                break;
            }
            case 'n':{
                addExtraTopping = false;
                break;
            }
        }
    }
    public void addExtraCheese(){
        System.out.print("Do you want extra cheese?(y/n): ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        switch (ch){
            case 'y':{
                addExtraCheese = true;
                this.price += extraCheesePrice;
                break;
            }
            case 'n':{
                addExtraCheese = false;
                break;
            }
        }
    }

    public void tackAway(){
        System.out.print("Do you want to takeAway?(y/n): ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        switch (ch){
            case 'y':{
                begPack = true;
                this.price += begPackPrice;
                break;
            }
            case 'n':{
                begPack = false;
                break;
            }
        }
    }
    public void generateBill(){
        String bill = " ";

        System.out.println("Base pizza price:"+basePizzaPrice);
        if(addExtraTopping){
           bill += "Extra Topping: "+ extraToppingPrice +"\n";
        }
        if (addExtraCheese){
          bill += "Extra Cheese: "+ extraCheesePrice +"\n";
        }
        if (begPack){
            bill += "Parcel: "+ begPackPrice+ "\n";
        }

        bill += "Total price : "+this.price;

        System.out.println(bill);
        System.out.println("\n\n\n THANK YOU !!!! VISIT AGAIN");
        System.out.println("-----------------------------------------------------------------------");
    }
}
