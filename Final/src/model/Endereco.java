package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue
	@Column(name="ID", nullable = false)
	private Long id;
	
	@Column(name = "RUA", length = 50, nullable = false)
	private String rua;
	
	@Column(name = "NUMERO", length = 10, nullable = false)
	private String numero;
	
	@Column(name = "CEP", length = 8, nullable = false)
	private String cep;
	
	@Column(name = "BAIRRO", length = 20, nullable = false)
	private String bairro;
	
	@Column(name = "MUNICIPIO", length = 20, nullable = false)
	private String municipio;
	
	@Column(name = "UF", length = 2, nullable = false)
	private String uf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.id
				+ " Rua: " + this.rua
				+ " Número: " + this.numero
				+ " CEP: " + this.cep
				+ " Bairro: " + this.bairro
				+ " Municipio: " + this.municipio
				+ " UF: " + this.uf;
				
	}
}
