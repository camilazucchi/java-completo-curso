package programacaoFuncional.util;

import programacaoFuncional.entities.Product;

import java.util.function.Predicate;

// Foi criada no pacote "util" por ser uma classe auxiliar:
public class ProductPredicate implements Predicate<Product> {
    // Função que retorna um boolean:
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
