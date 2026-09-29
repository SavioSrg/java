package exercicio_76.app;

import exercicio_76.model.Produto;
import exercicio_76.service.ProdutoService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Mouse Gamer", 150.00, "Periféricos"),
                new Produto("Mousepad", 45.00, "Acessórios"),
                new Produto("Teclado Mecânico", 320.00, "Periféricos"),
                new Produto("Cabo HDMI", 35.00, "Acessórios"),
                new Produto("Monitor 24", 850.00, "Monitores"),
                new Produto("Fone de Ouvido", 80.00, "Áudio"),
                new Produto("Webcam Full HD", 210.00, "Periféricos"),
                new Produto("Suporte para Notebook", 90.00, "Acessórios")
        );

        ProdutoService service = new ProdutoService();

        System.out.println(service.produtoPrecoFormatado(produtos));
        System.out.println(service.perifericosPorPreco(produtos, "Periféricos"));
    }
}
