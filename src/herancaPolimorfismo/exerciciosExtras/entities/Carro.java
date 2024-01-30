package herancaPolimorfismo.exerciciosExtras.entities;

public class Carro extends Veiculo {

    private Integer numPortas;

    public Carro(String marca, String modelo, Integer numPortas) {
        super(marca, modelo);
        this.numPortas = numPortas;
    }

    public Integer getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String mostraVeiculo() {
        return "Carro - Número de portas: " + numPortas;
    }

}
