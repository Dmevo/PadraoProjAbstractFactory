package pizzaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzariaTest {

    @Test
    void devePrepararPizzaCalabreza() {
        FabricaAbstrata fabrica = new FabricaCalabreza();
        Pizzaria pizzaria = new Pizzaria(fabrica);
        assertEquals("Pizza de Calabreza", pizzaria.prepararPizza());
    }

    @Test
    void devePrepararPizzaChocolate() {
        FabricaAbstrata fabrica = new FabricaChocolate();
        Pizzaria pizzaria = new Pizzaria(fabrica);
        assertEquals("Pizza de Chocolate", pizzaria.prepararPizza());
    }

    @Test
    void devePrepararPizzaMussarela() {
        FabricaAbstrata fabrica = new FabricaMussarela();
        Pizzaria pizzaria = new Pizzaria(fabrica);
        assertEquals("Pizza de Mussarela", pizzaria.prepararPizza());
    }
}
