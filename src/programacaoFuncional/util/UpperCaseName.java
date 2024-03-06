package programacaoFuncional.util;

import programacaoFuncional.entities.Product;

import java.util.function.Function;

/* A interface Function possui dois tipos "<T, R>", tipo de entrada e tipo de saída. */
public class UpperCaseName implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
