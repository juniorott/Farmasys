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
public class Funcionario {
    private CadastroProduto cadastroProduto;
    private CadastroCliente cadastroCliente;
    private Venda venda;

    public CadastroProduto getCadastroProduto() {
        return cadastroProduto;
    }

    public void setCadastroProduto(CadastroProduto cadastroProduto) {
        this.cadastroProduto = cadastroProduto;
    }

    public CadastroCliente getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
