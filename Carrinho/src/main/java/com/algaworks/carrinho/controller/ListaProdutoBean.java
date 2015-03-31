package com.algaworks.carrinho.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.carrinho.modelo.Produto;
import com.algaworks.carrinho.repository.Produtos;

@Named
@SessionScoped
public class ListaProdutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Produtos produtosRepository;

	
	private List<Produto> produtos;
	
	@PostConstruct
	public void consulta(){
		this.produtos = produtosRepository.todos();
	}

	public Produtos getProdutosRepository() {
		return produtosRepository;
	}

	public void setProdutosRepository(Produtos produtosRepository) {
		this.produtosRepository = produtosRepository;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	

	
	
	
	
}
