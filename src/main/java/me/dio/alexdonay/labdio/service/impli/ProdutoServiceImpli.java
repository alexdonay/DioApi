package me.dio.alexdonay.labdio.service.impli;

import me.dio.alexdonay.labdio.model.*;
import me.dio.alexdonay.labdio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoServiceImpli implements ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired


    @Override
    public Iterable<Produto> buscarTodos() {
        // Buscar todos os Clientes.
        return produtoRepository.findAll();
    }

    @Override
    public Produto buscarPorId(Long id) {
        Optional<Produto> cliente = produtoRepository.findById(id);
        return cliente.get();
    }

    @Override
    public Produto buscarPorPreco(Long precoInicial, Long precoFinal) {
        return null;
    }

    @Override
    public void inserir(Produto produto) {
        produtoRepository.save(produto);
        ;
    }
    @Override
    public void atualizar(Long id, Produto produto) {
        Optional<Produto> clienteBd = produtoRepository.findById(id);
        if (clienteBd.isPresent()) {
            produtoRepository.save(produto);

        }
    }

    @Override
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }

}
