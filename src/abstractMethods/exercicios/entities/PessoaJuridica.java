package abstractMethods.exercicios.entities;

public class PessoaJuridica extends Pessoa {

    private Integer numeroFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calculaImposto() {
        if (numeroFuncionarios <= 10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }
}
