import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestePU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		//Produto produto = new Produto();
		//produto.setId(1L); 
		//produto.setNome("Parafuso 32 x 12mm");
		//produto.setPreco(0.10);
		
		tx.begin();
			//em.persist(produto);
			//em.merge(produto);
		
			//Produto resultado = em.find(Produto.class, 1L);
			//System.out.println(resultado != null ? resultado.toString() : "Objeto não encontrado");
			
			//Produto produto = em.find(Produto.class, 1L);
			//if (produto != null) {
			//	em.remove(produto);
			//}
			
			
			String jpql = "select p from Produto p";
			Query query = em.createQuery(jpql);
			List<Produto> produtos = query.getResultList();
			
			for (Produto p: produtos) {
				System.out.println(p);
			}
		
		tx.commit();
		
	}

}
