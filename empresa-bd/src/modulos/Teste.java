package modulos;

import dao.DAO;

public class Teste {
	
	public static void main(String[] args) {
	
		
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		Cliente fo1 = new Cliente("Danilo Jo�o de Sousa", "anilo-adm@hotmail.com", "Rua geral", "Ensedada do Brito",
				"Palho�a", "SC", true, 4563356L, "21/06/1985");
		
		dao.abrirTransicao().persistir(fo1).fecharTransicao();
		
		dao.fecharConexao();
	}

}


