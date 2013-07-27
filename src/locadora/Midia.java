package locadora;

public class Midia {

    private String tipoMidia;
    private double valorMidia;

    Midia() {
    }

    Midia(String tipoMidia, double valorMidia) {
        this.tipoMidia = tipoMidia;
        this.valorMidia = valorMidia;
    }

    public double getValorMidia() {
        return this.valorMidia;
    }

    public String getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }
}
