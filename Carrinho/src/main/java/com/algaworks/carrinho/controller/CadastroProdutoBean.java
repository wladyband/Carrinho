package com.algaworks.carrinho.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.algaworks.carrinho.modelo.Produto;
import com.algaworks.carrinho.service.CadastroProdutoService;
import com.algaworks.carrinho.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private CadastroProdutoService cadastroProdutoService;

	private Produto produto;
	
	@PostConstruct
	public void inicializar(){
		this.produto = new Produto();
	}
	
	
	public CadastroProdutoBean() {
		
	}
	
	
	
	public void salvar(){
		 this.produto = cadastroProdutoService.salvar(this.produto);
		 
		 FacesUtil.addInfoMessage("Cadastrado com Sucesso");
		 
	}

	public Produto getProduto() {
		return produto;
	}
	

}
