package workshop1stencil;

public class Restaurant {

    public Restaurant(Chef chef) {
        this.openRestaurant();
        this.prepareOrders(chef);
    }

    public void openRestaurant() {
        System.out.println("Open for business!");
    }

    public void prepareOrders(Chef chef) {
        System.out.println("Taking orders");
        chef.makePizza("pepperoni");
        chef.makePizza("pineapple");
        chef.cutPizza(8);
        System.out.println("Your total is $" + chef.howManySlices(2, 8) * 1.25);
    }
}
