package herancaPolimorfismo.exerciciosExtras.entities;

public abstract class Veiculo {

    private String marca;
    private String modelo;

    protected Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract String mostraVeiculo();

}
