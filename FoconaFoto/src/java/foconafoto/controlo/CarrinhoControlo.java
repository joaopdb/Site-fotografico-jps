/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foconafoto.controlo;

import foconafoto.dao.CarrinhoDao;
import foconafoto.dao.ProdutoDao;
import foconafoto.model.Carrinho;
import foconafoto.model.Produtos;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bruno
 */
@WebServlet(name = "CarrinhoControlo", urlPatterns = {"/CarrinhoControlo"})
public class CarrinhoControlo extends HttpServlet {

    ProdutoDao produtoDao = new ProdutoDao();
    CarrinhoDao carrinhoDao = new CarrinhoDao();
    Carrinho carrinho;
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            String acao = request.getParameter("acao");

            if (acao.equalsIgnoreCase("adicionar_car")) {

                Produtos produto;
                
                int id = Integer.parseInt(request.getParameter("id_produto"));
                
                produto = produtoDao.getById(id);
                carrinhoDao.incluir(produto);
                
                response.sendRedirect("carrinho.jsp");
                
            } else if (acao.equalsIgnoreCase("remover_car")) {
                
                int id = Integer.parseInt(request.getParameter("id_produto"));
                
                carrinhoDao.deleteById(id);
                
                response.sendRedirect("carrinho.jsp");

            } else if (acao.equalsIgnoreCase("aumentar")) {
                
                int id = Integer.parseInt(request.getParameter("id_produto"));
                
                carrinho = carrinhoDao.getById(id);
                     
                int quant = carrinho.getQuant_prod();
                double vlr_unid = carrinho.getPreco_unit();
                double total = carrinho.getTotal();
                
                quant = quant + 1;
                total = total + vlr_unid;
                
                carrinhoDao.update(quant,total, id);
                
                response.sendRedirect("carrinho.jsp");
                
            } else if (acao.equalsIgnoreCase("diminuir")) {
                
                int id = Integer.parseInt(request.getParameter("id_produto"));
                
                carrinho = carrinhoDao.getById(id);
                     
                int quant = carrinho.getQuant_prod();
                double vlr_unid = carrinho.getPreco_unit();
                double total = carrinho.getTotal();
                
                if (quant == 0){
                    
                    quant = 0;       
                    
                }else{
                    
                quant = quant - 1;
                total = total - vlr_unid;
                     
                }
                
                carrinhoDao.update(quant,total,id);
                response.sendRedirect("carrinho.jsp");
                
            }

        } catch (NumberFormatException ex) {

            System.err.println("Erro na interação:" + ex.getMessage());

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
