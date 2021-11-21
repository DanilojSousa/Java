package modulos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("FO")
@Table(name = "fornecedor")
public class Fornecedor extends Cadastro {
	
	private Long cnpj;
	private String ramo;
	
	public Fornecedor(String nome, String email, String endereco, String bairro, String cidade, String estado,
			boolean situcao, Long cnpj, String ramo) {
		super(nome, email, endereco, bairro, cidade, estado, situcao);
		this.cnpj = cnpj;
		this.ramo = ramo;
	}

	public Fornecedor() {
		
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	
	
	
	
	
	
	

}
