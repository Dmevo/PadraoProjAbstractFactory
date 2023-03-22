package pizzaria;

public class Pizzaria {

    private Pizza pizza;

    public Pizzaria (FabricaAbstrata fabrica) {
        this.pizza = fabrica.createPizza();
    }

    public String prepararPizza() { return this.pizza.preparar(); }
}
