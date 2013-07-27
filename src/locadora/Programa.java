package locadora;

public class Programa {

    public static void main(String[] args) {

        Categoria categoria1 = new Categoria("Catalago", 1.0);
        Categoria categoria2 = new Categoria("Lançamento", 1.25);
        Categoria categoria3 = new Categoria("Super Lançamento", 1.50);

        Midia midia1 = new Midia("DVD", 2.50);
        Midia midia2 = new Midia("VHS", 2.50);
        Midia midia3 = new Midia("Blue-Ray", 3.50);

        Filme filme1 = new Filme("As Ferias de Mr Beans", "Comedia", categoria1);
        Filme filme2 = new Filme("Velozes e Furiosos", "Ação", categoria2);
        Filme filme3 = new Filme("Gladiador", "Ação", categoria1);
        Filme filme4 = new Filme("Homem de Ferro 3", "Ação", categoria3);
        Filme filme5 = new Filme("Homem de Aco", "Ação", categoria3);
        Filme filme6 = new Filme("Sonho Impossivel", "Aventura", categoria2);
        Filme filme7 = new Filme("As Viagens de Guliver", "Comedia", categoria2);
        Filme filme8 = new Filme("Alice no País das Maravilhas", "Aventura", categoria1);
        Filme filme9 = new Filme("Harry Potter e as Relíquias da Morte – Parte 1", "Ação", categoria2);
        Filme filme10 = new Filme("X-Men 3: o Confronto Final", "Ação", categoria1);
        Filme filme11 = new Filme("Lara Croft Tomb Raider (2001)", "Ação", categoria1);
        Filme filme12 = new Filme("Harry Potter e o Cálice de Fogo", "Ação", categoria1);
        Filme filme13 = new Filme("O Conde de Monte Cristo", "Drama", categoria1);
        Filme filme14 = new Filme("Harry Potter e o Prisioneiro de Azkaban", "Aventura", categoria1);

        ItemAcervo itemAcervo1 = new ItemAcervo(filme1, midia1, "001");
        ItemAcervo itemAcervo2 = new ItemAcervo(filme2, midia2, "002");
        ItemAcervo itemAcervo3 = new ItemAcervo(filme3, midia3, "003");
        ItemAcervo itemAcervo4 = new ItemAcervo(filme4, midia2, "004");
        ItemAcervo itemAcervo5 = new ItemAcervo(filme5, midia3, "005");
        ItemAcervo itemAcervo6 = new ItemAcervo(filme6, midia1, "006");
        ItemAcervo itemAcervo7 = new ItemAcervo(filme7, midia2, "007");
        ItemAcervo itemAcervo8 = new ItemAcervo(filme8, midia1, "008");
        ItemAcervo itemAcervo9 = new ItemAcervo(filme9, midia1, "009");
        ItemAcervo itemAcervo10 = new ItemAcervo(filme10, midia2, "010");
        ItemAcervo itemAcervo11 = new ItemAcervo(filme11, midia3, "011");
        ItemAcervo itemAcervo12 = new ItemAcervo(filme12, midia2, "012");
        ItemAcervo itemAcervo13 = new ItemAcervo(filme13, midia3, "013");
        ItemAcervo itemAcervo14 = new ItemAcervo(filme14, midia1, "014");

        Cliente cliente1 = new Cliente("Jose da Silva", "083.560.359-88");
        Cliente cliente2 = new Cliente("Pedro Paulo", "028.255.631-25");
        Cliente cliente3 = new Cliente("Marcos Pereira", "065.673.359-86");
        Cliente cliente4 = new Cliente("Marcia da Rosa", "325.763.349-16");

        Locacao locacao1 = new Locacao(cliente1);
        locacao1.adicionaItem(itemAcervo1);
        locacao1.adicionaItem(itemAcervo2);
        locacao1.adicionaItem(itemAcervo3);
        locacao1.imprimeLocacao();
        locacao1.removeItem(1);
        locacao1.imprimeLocacao();

        Locacao locacao2 = new Locacao(cliente2);
        locacao2.adicionaItem(itemAcervo1); // item já alugado
        locacao2.adicionaItem(itemAcervo4);
        locacao2.adicionaItem(itemAcervo5);
        locacao2.adicionaItem(itemAcervo6);
        locacao2.adicionaItem(itemAcervo7);
        locacao2.imprimeLocacao();

        Locacao locacao3 = new Locacao(cliente3);
        locacao3.imprimeLocacao();

        Locacao locacao4 = new Locacao(cliente4);
        //locacao4.adicionaItem(itemAcervo4); // item já alugado
        locacao4.adicionaItem(itemAcervo8);
        locacao4.adicionaItem(itemAcervo9);
        locacao4.adicionaItem(itemAcervo10);
        locacao4.adicionaItem(itemAcervo11);
        locacao4.adicionaItem(itemAcervo12);
        locacao4.adicionaItem(itemAcervo13);
        locacao4.adicionaItem(itemAcervo14);
        locacao4.imprimeLocacao();        
        locacao4.removeItem(4);
        locacao4.imprimeLocacao();
    }
}
