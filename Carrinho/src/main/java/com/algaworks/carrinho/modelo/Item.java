package com.algaworks.carrinho.modelo;

public class Item {
	
	private Produto produto = new Produto();
	private int quantidadeItem;
	
	
	
	public Item() {
		super();
	}

	public Item(Produto produto, int quantidadeItem) {
		super();
		this.produto = produto;
		this.quantidadeItem = quantidadeItem;
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	
	
	

}
