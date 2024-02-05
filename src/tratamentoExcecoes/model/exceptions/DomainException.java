package tratamentoExcecoes.model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    // A classe RuntimeException é um tipo de exceção que o compilador não obriga o tratamento.
    // A classe Exception já é diferente, o compilador obriga o tratamento! Por exemplo: ParseException.

    @Serial
    private static final long serialVersionUID = 1L;

    // Permite a instância da exceção personalizada passando uma mensagem:
    public DomainException(String message) {
        super(message);
    }

}
