package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<E> {
	
	//ATRIBUTOS
	private static EntityManagerFactory emf;
	private EntityManager em;
	
	private Class<E> classe;
	
	//INICIANDO CONEXÃO
	static {
		
		try {
			emf = Persistence.createEntityManagerFactory("empresa-bd");
		} catch (Exception e) {
			
			System.out.println("Erro ao iniciar");
		}
	}
	
	//CONSTRUTOR
	public DAO(Class<E> classe) {
		this.classe = classe;
		this.em = emf.createEntityManager();
	}
	
	public DAO() {
		this(null);
		
	}
	
	//METODOS
		
		//ABRINDO TRANSIÇÃO
			public DAO<E> abrirTransicao(){
				em.getTransaction().begin();;
				return this;
			}
			
		//FECHANDO TRANSIÇÃO
			public DAO<E> fecharTransicao(){
				em.getTransaction().commit();
				return this;
			}
		
		//INSERIR TRANSIÇÃO
			public DAO<E> persistir(E entidade){
				em.persist(entidade);
				return this;
			}
		
		//FECHAR CONEXAO
			public void fecharConexao() {
				em.close();
			}
	
		//INSERIR GERAL
			public DAO<E> persistirGeral(E entidade){
				return abrirTransicao().persistir(entidade).fecharTransicao();	 
			}
			
		

}
