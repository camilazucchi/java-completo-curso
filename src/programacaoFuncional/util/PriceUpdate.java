package programacaoFuncional.util;

import programacaoFuncional.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    // Aumenta o preço em 10%:
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
