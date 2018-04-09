/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foconafoto.dao;

import foconafoto.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class ProdutoDao {
    
    private static final String SQL_GET_BY_ID = "SELECT * FROM tb_produtos WHERE id_prod = ?;";
    private static final String SQL_GET_ALL = "SELECT * FROM tb_produtos;";

    
     public Produtos getById(int idProduto){
        Connection con = null;
        java.sql.PreparedStatement st;
        Statement stm;
        ResultSet rs;
        Produtos produto = null;

        try {
            con = Conexao.conecta();
            st = con.prepareStatement(SQL_GET_BY_ID);
            st.setInt(1, idProduto);
            rs = st.executeQuery();

            while (rs.next()) {
                produto = new Produtos();
                produto.setId(idProduto);
                produto.setNome(rs.getString("nome_prod"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuant_estoque(rs.getInt("quantidade_estoque"));
                produto.setFoto_produto(rs.getString("foto_principal"));
                produto.setNum_parcelas(rs.getInt("num_parcelas"));
                produto.setValor_parcela(rs.getDouble("valor_parcela"));
                produto.setValor_prazo(rs.getDouble("valor_prazo"));
                produto.setReview(rs.getInt("review"));
                
            }
          
        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            Conexao.desconectar(con);
        }

        return produto;
    }
     
     public List<Produtos> getAll() {

        Connection con = null;
        PreparedStatement st;
        ResultSet rs;
        Produtos produto;

        List<Produtos> listaProdutos = new ArrayList();

        try {
            con = Conexao.conecta();
            st = con.prepareStatement(SQL_GET_ALL);
            rs = st.executeQuery();

            while (rs.next()) {
                
                produto = new Produtos();
                produto.setId(rs.getInt("id_prod"));
                produto.setNome(rs.getString("nome_prod"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuant_estoque(rs.getInt("quantidade_estoque"));
                produto.setFoto_produto(rs.getString("foto_principal"));
                produto.setNum_parcelas(rs.getInt("num_parcelas"));
                produto.setValor_parcela(rs.getDouble("valor_parcela"));
                produto.setValor_prazo(rs.getDouble("valor_prazo"));
                produto.setReview(rs.getInt("review"));

                listaProdutos.add(produto);
                
            }

        } catch (ClassNotFoundException | SQLException e) {
        } finally {
            Conexao.desconectar(con);
        }

        return listaProdutos;

    }
    
}
