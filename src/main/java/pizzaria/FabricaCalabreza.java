package pizzaria;

public class FabricaCalabreza implements FabricaAbstrata{

    @Override
    public Pizza createPizza() {
        return new PizzaCalabreza();
    }
}
