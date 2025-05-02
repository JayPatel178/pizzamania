package bill;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select your pizza: \n 1. Veg pizza\n 2. Non-Veg\n 3. Delux Veg pizza\n 4. Delux Non-Veg pizza");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                Pizza pz = new Pizza(true);
                pz.addExtraTopping();
                pz.addExtraCheese();
                pz.tackAway();
                pz.generateBill();
                break;
            }
            case 2: {
                Pizza pz = new Pizza(false);
                pz.addExtraTopping();
                pz.addExtraCheese();
                pz.tackAway();
                pz.generateBill();
                break;
            }
            case 3: {
                DeluxPizza dpz = new DeluxPizza(true);
                dpz.basePizzaPrice = 550;
                dpz.addExtraTopping();
                dpz.addExtraCheese();
                dpz.tackAway();
                dpz.generateBill();
                break;
            }
            case 4: {
                DeluxPizza dpz = new DeluxPizza(false);
                dpz.basePizzaPrice = 650;
                dpz.addExtraTopping();
                dpz.addExtraCheese();
                dpz.tackAway();
                dpz.generateBill();
                break;
            }
            default:
                System.out.println("Sorry Enter the correct option and try again!");
        }

        sc.close();
    }
}