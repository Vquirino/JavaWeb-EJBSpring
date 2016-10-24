package sessionbean;

import java.util.List;
import javax.ejb.Local;
import entity.Produto;

@Local
public interface ProdutoFacadeLocal {
	
	void create (Produto p);
	
	void delete (Produto p);
	
	void update (Produto p);
	
	List<Produto> findAll();
	
	Produto find(Integer id);
	

}
