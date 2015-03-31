package com.algaworks.carrinho.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.carrinho.modelo.Produto;
import com.algaworks.carrinho.repository.Produtos;
import com.algaworks.carrinho.util.jpa.Transactional;

public class CadastroProdutoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Produtos produtos;
	
	
	public Produto salvar(Produto produto) {
		return produtos.guardar(produto);
	}

}
