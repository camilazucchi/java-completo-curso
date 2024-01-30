package herancaPolimorfismo.exerciciosExtras.entities;

public class Moto extends Veiculo {

    private String tipoFreio;

    public Moto(String marca, String modelo, String tipoFreio) {
        super(marca, modelo);
        this.tipoFreio = tipoFreio;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String mostraVeiculo() {
        return "Moto - Tipo de freio: " + tipoFreio;
    }

}
