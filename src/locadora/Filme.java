package locadora;

public class Filme {

    private String nome;
    private String genero;
    private Categoria categoria;
    private boolean isDisponivel;

    Filme(String nome, String genero, Categoria categoria) {
        this.nome = nome;
        this.genero = genero;
        this.categoria = categoria;
        this.isDisponivel = true;
    }
    
    public boolean getIsDisponivel(){
        return this.isDisponivel;
    }
    
    public void setIsDisponivel(boolean isDisponivel){
        this.isDisponivel = isDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}