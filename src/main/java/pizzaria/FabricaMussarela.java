package pizzaria;

public class FabricaMussarela implements FabricaAbstrata{

    @Override
    public Pizza createPizza() {
        return new PizzaMussarela();
    }
}
