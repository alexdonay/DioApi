package me.dio.alexdonay.labdio.controller;

import me.dio.alexdonay.labdio.model.Produto;
import me.dio.alexdonay.labdio.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletResponse;
@CrossOrigin(origins = "http://localhost:56231",maxAge = 3600)
@RestController
@RequestMapping("produtos")
public class ProdutoRestController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<Iterable<Produto>> buscarTodos() {
        return ResponseEntity.ok(produtoService.buscarTodos());
    }
    @GetMapping("/{precoInicial}/{precoFinal}")
    public ResponseEntity<Produto> buscarPorPreco(@PathVariable Long precoInicial,@PathVariable Long precoFinal ) {
        return ResponseEntity.ok(produtoService.buscarPorPreco(precoInicial,precoInicial));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Produto> inserir(@RequestBody Produto produto) {
        produtoService.inserir(produto);
        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        produtoService.atualizar(id, produto);
        return ResponseEntity.ok(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
