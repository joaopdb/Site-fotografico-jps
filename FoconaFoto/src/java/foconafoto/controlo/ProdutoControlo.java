
package foconafoto.controlo;

import foconafoto.dao.ProdutoDao;
import foconafoto.model.Produtos;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bruno
 */
@WebServlet(name = "ProdutoControlo", urlPatterns = {"/ProdutoControlo"})
public class ProdutoControlo extends HttpServlet {

   ProdutoDao produtoDao = new ProdutoDao();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        try{
            
            String acao = request.getParameter("acao");
            
            if (acao.equalsIgnoreCase("buscar_id")){
                
                Produtos produto;
                
                int id = Integer.parseInt(request.getParameter("id_produto"));
                
                produto = produtoDao.getById(id);
                
                request.setAttribute("produto", produto);
                
                RequestDispatcher rd = request.getRequestDispatcher("produto.jsp");
                rd.forward(request, response);
                
            }
            
        }catch(ServletException | IOException | NumberFormatException ex){
            
            System.err.println("Erro na interação:"+ex.getMessage());
            
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
