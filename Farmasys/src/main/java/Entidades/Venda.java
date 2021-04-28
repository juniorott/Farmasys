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
public class Venda {
    private TipoPagamento tipoPagamento;
    private Produto produto;
    private CadastroCliente cadastroCliente;

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CadastroCliente getCadastroCliente() {
        return cadastroCliente;
    }

    public void setCadastroCliente(CadastroCliente cadastroCliente) {
        this.cadastroCliente = cadastroCliente;
    }
}
