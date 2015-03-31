import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.algaworks.carrinho.modelo.Produto;


public class GeraTabela {
	public static void main(String[] args) {
		
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("CarrinhoPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Produto produto = new Produto();
		produto.setNome("DVD");
		produto.setDescricao("4 gigas de memoria");
		produto.setPreco(135);
		produto.setQuantidade(4);
		manager.persist(produto);
		
		trx.commit();
		
		
	}

}
