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
public class Produto {
    private int id;
    private int informacaoProduto;
    private int qtdEstoque;
    private CadastroProduto cadastroProduto;
    private Receita receita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInformacaoProduto() {
        return informacaoProduto;
    }

    public void setInformacaoProduto(int informacaoProduto) {
        this.informacaoProduto = informacaoProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public CadastroProduto getCadastroProduto() {
        return cadastroProduto;
    }

    public void setCadastroProduto(CadastroProduto cadastroProduto) {
        this.cadastroProduto = cadastroProduto;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    
    
}


