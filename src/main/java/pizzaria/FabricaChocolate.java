package pizzaria;

public class FabricaChocolate implements FabricaAbstrata{

    @Override
    public Pizza createPizza() {
        return new PizzaChocolate();
    }
}
