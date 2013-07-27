package locadora;

import javax.swing.JOptionPane;

public class Locacao {

    private ItemAcervo[] itens = new ItemAcervo[20];
    private Cliente cliente;
    private int contador;
    private static double valorTotalLocacao;
    private static int numeroLocacao;

    Locacao(Cliente cliente) {
        this.cliente = cliente;
        valorTotalLocacao = 0;
        numeroLocacao++;
    }

    void adicionaItem(ItemAcervo item) {
        if (item.getFilme().getIsDisponivel()) {
            this.itens[contador] = item;
            valorTotalLocacao = valorTotalLocacao + itens[contador].getValor();
            // Marca o filme como alugado
            this.itens[contador].getFilme().setIsDisponivel(false);
        } else {
            this.itens[contador] = null;
        }
        contador++;
    }

    void removeItem(int posicao) {
            valorTotalLocacao = valorTotalLocacao - itens[posicao-1].getValor();
            this.itens[posicao-1] = null;
            // Marca o filme como alugado
            //this.itens[posicao-1].getFilme().setIsDisponivel(false);
    }

    void imprimeLocacao() {
        JOptionPane.showMessageDialog(null,"============================================="+
        "\nLocação No: " + Locacao.numeroLocacao+
        "\nCLiente: " + cliente.getNome() + " - CPF: " + cliente.getCpf()
         +"\n");
        //Verifica se existe algum item alugado
        if (contador > 0) {
            for (int cont = 0; cont < contador; cont++) {
                ItemAcervo item = itens[cont];
                if (item != null) {
                   JOptionPane.showMessageDialog(null,"Item " + (cont + 1) + " - " + itens[cont].getFilme().getNome()
                    // Imprime o genero do filme
                    +"\n - Genero: " + itens[cont].getFilme().getGenero()
                    // Imprime o valor de cada item alugado
                    +"\n - Valor: R$ " + itens[cont].getValor()
                    // Imprime o prazo de devolução de cada item alugado
                    +"\n - Entregar em " + itens[cont].getFilme().getCategoria().getDiasDevolucao() + " dia(s).");
                } else {
                    JOptionPane.showMessageDialog(null,"Item " + (cont + 1) + " - Item nao disponivel");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"Nao existe item alugado!");
        }
        JOptionPane.showMessageDialog(null,""
        +"\nValor Total desta Locacao: R$ " + valorTotalLocacao
        +"\n");
    }
}
