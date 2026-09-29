package exercicio_75.service;

import exercicio_75.model.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProdutoService {

    public String produtoPrecoFormatado (List<Produto> produtos) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() > 100)
                .map(Produto::getNome)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public List<String> perifericosPorPreco(List<Produto> produtos, String categoria) {
        return produtos.stream()
                .filter(produto -> produto.getCategoria().equals(categoria))
                .sorted(Comparator.comparingDouble(Produto::getPreco))
                .map(Produto::getNome)
                .collect(Collectors.toList());
    }

    public Map<String, Long> contagemPorCategoria(List<Produto> produtos) {
        return produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
    }

    public Map<String, Double> precoMedioPorCategoria(List<Produto> produtos) {
        return produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.averagingDouble(Produto::getPreco)));
    }

    public Map<String, Double> somaPrecoPorCategoria(List<Produto> produtos) {
        return produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.summingDouble(Produto::getPreco)));
    }

    public Map<Boolean, List<Produto>> particionarPorPreco(List<Produto> produtos, double limite) {
        return produtos.stream()
                .collect(Collectors.partitioningBy(produto -> produto.getPreco() > limite));
    }
}
