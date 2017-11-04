import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Endereco;
import model.dao.EnderecoDAO;

public class Teste { 

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestePU");
		EntityManager em = emf.createEntityManager();
		
		EnderecoDAO enderecoDAO = new EnderecoDAO(em);
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua B");
		endereco.setNumero("1015");
		endereco.setCep("52692590");
		endereco.setBairro("Centro");
		endereco.setMunicipio("Recife");
		endereco.setUf("PE");
		
		enderecoDAO.salvar(endereco);

	}

}
