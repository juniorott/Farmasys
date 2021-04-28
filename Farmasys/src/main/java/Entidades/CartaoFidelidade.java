/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Luciano
 */
public class CartaoFidelidade {
    private CadastroCliente cadastroCliente;
    private Float descontoProduto;

    public CadastroCliente getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public Float getDescontoProduto() {
        return descontoProduto;
    }

    public void setDescontoProduto(Float descontoProduto) {
        this.descontoProduto = descontoProduto;
    }
    
    
}
