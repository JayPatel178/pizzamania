package bill;

public class DeluxPizza extends Pizza {
    public DeluxPizza (boolean deluxVeg){

        super(deluxVeg);
    }

    @Override
    public void addExtraTopping() {
        this.price += extraToppingPrice;
    }

    @Override
    public void addExtraCheese() {
        this.price += extraCheesePrice;
    }
}
