package com.algaworks.carrinho.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.carrinho.modelo.Item;
import com.algaworks.carrinho.modelo.Produto;
import com.algaworks.carrinho.repository.Produtos;

@Named
@SessionScoped
public class ListaCarrinhoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Produtos produtosRepository;

	private List<Produto> produtos;

	private List<Item> cart = new ArrayList<Item>();

	
	private String orderby(Produto produtos) {
		 this.produtos =   produtosRepository.todos();
		
		this.cart.add(new Item(produtos, 1));
		return "Cart?faces-redirect=true";

	}

	public List<Item> getCart() {
		return cart;
	}

	public void setCart(List<Item> cart) {
		this.cart = cart;
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
