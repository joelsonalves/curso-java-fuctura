package model.dao;

import java.util.List;

import model.Endereco;

public interface IEnderecoDAO {
	public void salvar(Endereco endereco);
	public void alterar(Endereco endereco);
	public void remover (Endereco endereco);
	public Endereco pesquisar (Long id);
	public List<Endereco> recuperarTodos();
}
