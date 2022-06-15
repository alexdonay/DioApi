package me.dio.alexdonay.labdio.service;

import me.dio.alexdonay.labdio.model.Produto;

public interface ProdutoService {

    Iterable<Produto> buscarTodos();

    Produto buscarPorId(Long id);
    Produto buscarPorPreco(Long precoInicial, Long precoFinal);

    void inserir(Produto produto);

    void atualizar(Long id, Produto produto);

    void deletar(Long id);

}
