/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foconafoto.model;

/**
 *
 * @author bruno
 */
public class Carrinho {
    
    private int id;
    private int quant_prod;
    private double total;
    private String nome_prod;
    private String foto_principal;
    private double preco_unit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuant_prod() {
        return quant_prod;
    }

    public void setQuant_prod(int quant_prod) {
        this.quant_prod = quant_prod;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getFoto_principal() {
        return foto_principal;
    }

    public void setFoto_principal(String foto_principal) {
        this.foto_principal = foto_principal;
    }

    public double getPreco_unit() {
        return preco_unit;
    }

    public void setPreco_unit(double preco_unit) {
        this.preco_unit = preco_unit;
    }  
    
}

