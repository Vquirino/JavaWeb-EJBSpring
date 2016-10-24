package control;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import sessionbean.ProdutoFacadeRemote;

import entity.Produto;

public class ManterProduto extends MultiActionController{
	
	public ModelAndView consultar(HttpServletRequest request, HttpServletResponse response, Produto p) throws Exception{
		Context c = new InitialContext();
		ProdutoFacadeRemote facade = (ProdutoFacadeRemote) c.lookup("ProdutoFacade/remote");
		
		ModelMap m = new ModelMap();
		m.addAttribute("dados", facade.findAll());
		m.addAttribute("produto", p);
		
		return new ModelAndView("formulario", m);
	}
	
	public ModelAndView cadastrar(HttpServletRequest request, HttpServletResponse response, Produto p) throws Exception{
		Context c = new InitialContext();
		ProdutoFacadeRemote facade = (ProdutoFacadeRemote) c.lookup("ProdutoFacade/remote");
		
		try{
			facade.create(p);
			request.setAttribute("mensagem", "Produto cadastrado com sucesso!");
		}catch(Exception e){
			request.setAttribute("mensagem", e.getMessage());
		}
		
		return consultar(request, response, new Produto());
	}
	
	

}
