package sessionbean;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Produto;

@Stateless
public class ProdutoFacade implements ProdutoFacadeLocal, ProdutoFacadeRemote {

	@PersistenceContext
	private EntityManager em;
	
	public void create (Produto p){
		em.persist(p);
	}
	
	public void delete (Produto p){
		em.remove(p);
	}
	
	public Produto find (Integer id){
		return em.find(Produto.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> findAll(){
		return em.createQuery("from Produto").getResultList();
	}
	
	public void update (Produto p){
		em.merge(p);
	}
	
}
