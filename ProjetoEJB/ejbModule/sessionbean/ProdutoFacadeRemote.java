package sessionbean;

import java.util.List;
import javax.ejb.Remote;
import entity.Produto;

@Remote
public interface ProdutoFacadeRemote {

	void create (Produto p);
	
	void delete (Produto p);
	
	void update (Produto p);
	
	List<Produto> findAll();
	
	Produto find(Integer id);
	
}
