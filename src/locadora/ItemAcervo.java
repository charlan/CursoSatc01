package locadora;

public class ItemAcervo {

    private Filme filme;
    private Midia midia;
    private String codigoBarrasItem;

    ItemAcervo(Filme filme, Midia midia, String codigoBarrasItem) {
        this.codigoBarrasItem = codigoBarrasItem;
        this.filme = filme;
        this.midia = midia;
    }

    double getValor() {
        double valor = midia.getValorMidia();
        double acrescimos = filme.getCategoria().getPercentualAcrescimoCategoria();
        return valor * acrescimos;
    }

    public String getCodigoBarrasItem() {
        return codigoBarrasItem;
    }

    public Filme getFilme() {
        return filme;
    }
}
