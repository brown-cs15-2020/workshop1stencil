package workshop1stencil;

public class Restaurant {

    public Restaurant(Chef chef) {
    }


    public void prepareOrders(Chef chef) {
        System.out.println("Taking orders");
        chef.makePizza("pepperoni");
    }
}
