package com.tc.lista.Controller;

import com.tc.lista.Model.EntidadeProduto;
import com.tc.lista.Service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public EntidadeProduto cadastrar(@RequestBody EntidadeProduto produto) {
        return service.salvar(produto);
    }

    @GetMapping
    public List<EntidadeProduto> listar() {
        return service.listar();
    }

    @PutMapping("/{id}")
    public EntidadeProduto atualizar(@PathVariable Long id, @RequestBody EntidadeProduto entidadeProduto) {
        return service.atualizar(id, entidadeProduto);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        service.delete(id);
    }
}