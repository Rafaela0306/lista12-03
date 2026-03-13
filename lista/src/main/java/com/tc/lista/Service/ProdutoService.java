package com.tc.lista.Service;

import com.tc.lista.Model.EntidadeProduto;
import com.tc.lista.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class ProdutoService{
        private final ProdutoRepository repository;

        public ProdutoService(ProdutoRepository repository) {
            this.repository = repository;
        }
        public EntidadeProduto salvar(EntidadeProduto entidadeProduto) {
            return repository.save(entidadeProduto);
        }
        public List<EntidadeProduto> listar(){
            return repository.findAll();
        }
        public EntidadeProduto atualizar(Long id, EntidadeProduto entidadeProdutoatualizado) {
            EntidadeProduto entidadeProduto = repository.findById(id).orElseThrow();
        }

        EntidadeProduto.setNome(entidadeProdutoatualizado.getNome());


    }

