package locadora;

public class Categoria {

    private String nomeCategoria;
    private double percentualAcrescimo;

    Categoria() {
    }

    Categoria(String nomeCategoria, double percentualAcrescimoCategoria) {
        this.nomeCategoria = nomeCategoria;
        this.percentualAcrescimo = percentualAcrescimoCategoria;
    }

    public double getPercentualAcrescimoCategoria() {
        return percentualAcrescimo;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public int getDiasDevolucao() {
        if (this.nomeCategoria.equals("Super Lançamento")) {
            return 1; // Devolver em 1 dia
        } else {
            if (this.nomeCategoria.equals("Lançamento")) {
                return 2;
            } else {
                return 5;
            }
        }
    }
}
