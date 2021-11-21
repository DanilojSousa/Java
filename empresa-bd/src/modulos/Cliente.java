package modulos;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CL")
@Table(name = "cliente")
public class Cliente extends Cadastro {
	
	private Long rg;
	private String dataNascimento;
	
	public Cliente(String nome, String email, String endereco, String bairro, String cidade, String estado,
			boolean situcao, Long rg, String dataNascimento) {
		super(nome, email, endereco, bairro, cidade, estado, situcao);
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public Cliente() {
		
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
	
	

}
