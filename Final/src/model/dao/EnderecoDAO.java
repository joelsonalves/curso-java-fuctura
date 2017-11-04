package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Endereco;

public class EnderecoDAO implements IEnderecoDAO {

	private EntityManager em;
	
	public EnderecoDAO(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void salvar(Endereco endereco) {
		
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
			this.em.persist(endereco);
		tx.commit();

	}

	@Override
	public void alterar(Endereco endereco) {

		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
			this.em.merge(endereco);
		tx.commit();

	}

	@Override
	public void remover(Endereco endereco) {

		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
			this.em.remove(endereco);
		tx.commit();

	}

	@Override
	public Endereco pesquisar(Long id) {

		Endereco endereco = this.em.find(Endereco.class, id);
		return endereco;
	}

	@Override
	public List<Endereco> recuperarTodos() {

		Query query = this.em.createQuery("select * from Endereco e");
		List<Endereco> enderecos = query.getResultList();
		return enderecos;
		
	}

}
