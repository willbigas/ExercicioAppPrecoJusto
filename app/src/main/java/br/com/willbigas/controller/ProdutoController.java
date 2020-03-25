package br.com.willbigas.controller;

import br.com.willbigas.model.Produto;

public class ProdutoController {

    public Produto calcular(Produto produto) {
        produto = calcularValores(produto);
        return produto;
    }


    private Produto calcularValores(Produto produto) {
        produto.setValorInicial(produto.getValor());
        produto.setValorParcelas(produto.getValor() / produto.getQtdParcelas());
        produto.setValorTotalJuros(produto.getValorInicial() * (produto.getJuros() / 100));
        produto.setValorTotal(produto.getValorInicial() + produto.getValorTotalJuros());
        return produto;
    }
}
