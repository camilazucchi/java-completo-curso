package programacaoFuncional.services;

import programacaoFuncional.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    /* O método "filteredSum" ficava preso na condição "if (p.getName().chartAt(0) == 'T'". Para melhorarmos, podemos
    * passar essa condição como PARÂMETRO (entre os parênteses) do método. */
    public double filteredSum(List<Product> productList, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : productList) {
            /* Teste genérico de qualquer predicado que for recebido como parâmetro "criteria". */
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
