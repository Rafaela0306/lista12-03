package com.tc.lista.Repository;

import com.tc.lista.Model.EntidadeProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<EntidadeProduto, Long> {

}
