package control;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sessionbean.ProdutoFacadeRemote;

import entity.Produto;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controle() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Produto p = new Produto(request.getParameter("nome"), new Double(request.getParameter("preco")));
			Context c = new InitialContext();
			
			ProdutoFacadeRemote facade = (ProdutoFacadeRemote) c.lookup("ProdutoFacade/remote");
			
			facade.create(p);
			request.setAttribute("mensagem", "Produto cadastrado com sucesso!");
		}
		catch(Exception e){
			request.setAttribute("mensagem", e.getMessage());
		}
		finally{
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
