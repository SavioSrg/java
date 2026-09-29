package exercicio_75.app;

import exercicio_75.model.Produto;
import exercicio_75.service.ProdutoService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

        Map contagemCategoria = service.contagemPorCategoria(produtos);
        System.out.println(contagemCategoria);

        Map<String, Double> precoMedioCategoria = service.precoMedioPorCategoria(produtos);
        System.out.println(precoMedioCategoria);

        Map<String, Double> precoPorCategoria = service.somaPrecoPorCategoria(produtos);
        System.out.println(precoPorCategoria);

        Map<Boolean, List<Produto>> particionarPorPreco = service.particionarPorPreco(produtos, 500);
        System.out.println(particionarPorPreco.get(true));

        Optional<Produto> produtoMaisCaro = service.produtoMaisCaro(produtos);
        String nomeProdutoMaisCaro = produtoMaisCaro.map(Produto::getNome).orElse("Nenhum produto encontrado");

        System.out.println(nomeProdutoMaisCaro);

        Produto produtoEncontrado = service.buscarPorNomeOuFalhar(produtos, "Monitor 24");
        System.out.println(produtoEncontrado);

    }
}
