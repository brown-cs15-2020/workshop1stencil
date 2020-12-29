package workshop1stencil;

public class Chef {

    public Chef() {
    }

    public void makePizza(String topping) {
        System.out.println("Making pizza with " + topping);
    }

    public void cutPizza(int numPieces) {
        System.out.println("Cutting pizza into " + numPieces + " slices");
    }

    public int howManySlices(int numPizzas, int slicesPerPizza) {
        return numPizzas * slicesPerPizza;
    }
}
