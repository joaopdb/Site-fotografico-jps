/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foconafoto.dao;

import foconafoto.model.Carrinho;
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
public class CarrinhoDao {
    
     private static final String SQL_INSERIR = "INSERT INTO tb_carrinho ( quant_prod, total, nome_prod, foto_principal, preco_unid) "
            + "VALUES (?, ?, ?, ?, ?);";
     private static final String SQL_DELETE_BY_ID = "DELETE FROM tb_carrinho WHERE id_car = ?;";
     private static final String SQL_GET_ALL = "SELECT * FROM tb_carrinho;";
     private static final String SQL_GET_BY_ID = "SELECT * FROM tb_carrinho WHERE id_car = ?;";
     private static final String SQL_UPDATE_CARRINHO = "UPDATE tb_carrinho SET quant_prod = ?, total = ? WHERE id_car = ?;";
     
     
      public int incluir(Produtos produto){

        Connection con = null;
        PreparedStatement st;
        ResultSet generatedKeys;

        try {
            con = Conexao.conecta();
            st = (PreparedStatement) con.prepareStatement(SQL_INSERIR, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setInt(1, 1);
            st.setDouble(2, produto.getPreco());
            st.setString(3, produto.getNome());
            st.setString(4, produto.getFoto_produto());
            st.setDouble(5, produto.getPreco());
            
            st.executeUpdate();

            generatedKeys = st.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Criação do carrinho!");
            }

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            Conexao.desconectar(con);
        }

        return 0;
    }
      
       public boolean deleteById(int idProduto)
     {
        Connection con = null;
        java.sql.PreparedStatement st;
        
        try {
            con = Conexao.conecta();
            st = con.prepareStatement(SQL_DELETE_BY_ID);
            st.setInt(1, idProduto);
            st.executeUpdate();
            
            return true;

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            Conexao.desconectar(con);
        }
        return false;
     }
       
       public List<Carrinho> getAll() {

        Connection con = null;
        PreparedStatement st;
        ResultSet rs;
        Carrinho carrinho;

        List<Carrinho> listaProdutos = new ArrayList();

        try {
            con = Conexao.conecta();
            st = con.prepareStatement(SQL_GET_ALL);
            rs = st.executeQuery();

            while (rs.next()) {
                
                carrinho = new Carrinho();
                carrinho.setId(rs.getInt("id_car"));
                carrinho.setQuant_prod(rs.getInt("quant_prod"));
                carrinho.setTotal(rs.getDouble("total"));
                carrinho.setNome_prod(rs.getString("nome_prod"));
                carrinho.setFoto_principal(rs.getString("foto_principal"));
                carrinho.setPreco_unit(rs.getDouble("preco_unid"));

                listaProdutos.add(carrinho);
                
            }

        } catch (ClassNotFoundException | SQLException e) {
        } finally {
            Conexao.desconectar(con);
        }

        return listaProdutos;

    }
       
        public void update(int quant,double total,int id) {
        Connection con = null;
        PreparedStatement st;

        try {
            con = Conexao.conecta();
            st = con.prepareStatement(SQL_UPDATE_CARRINHO);
            st.setInt(1, quant);
            st.setDouble(2, total);
            st.setInt(3, id);
            st.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            Conexao.desconectar(con);
        }
        
        
    }
        
        public Carrinho getById(int idCarrinho){
        Connection con = null;
        java.sql.PreparedStatement st;
        Statement stm;
        ResultSet rs;
        Carrinho carrinho = null;

        try {
            con = Conexao.conecta();
            st = con.prepareStatement(SQL_GET_BY_ID);
            st.setInt(1, idCarrinho);
            rs = st.executeQuery();

            while (rs.next()) {
                
                carrinho = new Carrinho();
                carrinho.setId(rs.getInt("id_car"));
                carrinho.setQuant_prod(rs.getInt("quant_prod"));
                carrinho.setTotal(rs.getDouble("total"));
                carrinho.setNome_prod(rs.getString("nome_prod"));
                carrinho.setFoto_principal(rs.getString("foto_principal"));
                carrinho.setPreco_unit(rs.getDouble("preco_unid"));
                
            }
          
        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            Conexao.desconectar(con);
        }

        return carrinho;
    }
    
}
