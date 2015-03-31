package com.algaworks.carrinho.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.criterion.CriteriaQuery;

import com.algaworks.carrinho.modelo.Produto;
import com.algaworks.carrinho.util.jpa.Transactional;

public class Produtos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;


	@Transactional
	public Produto guardar(Produto produto) {

		return manager.merge(produto);
	}

	@Transactional
	public List<Produto> todos() {
		
		try {
			
			//return manager.createQuery("from * Produto", Produto.class).getResultList();
			TypedQuery<Produto> query = manager.createQuery("from Produto", Produto.class);
			return query.getResultList();
			
		} catch (NoResultException e) {
			return null;
		}

	}

}
