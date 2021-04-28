/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author Luciano
 */
public class AvisoRelatorio {
    private RelatorioVenda relatorioVenda;
    private Produto produto;
    private boolean ProdutoAcabando;
    private Date VencimentoProduto;

    public RelatorioVenda getRelatorioVenda() {
        return relatorioVenda;
    }

    public void setRelatorioVenda(RelatorioVenda relatorioVenda) {
        this.relatorioVenda = relatorioVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public boolean isProdutoAcabando() {
        return ProdutoAcabando;
    }

    public void setProdutoAcabando(boolean ProdutoAcabando) {
        this.ProdutoAcabando = ProdutoAcabando;
    }

    public Date getVencimentoProduto() {
        return VencimentoProduto;
    }

    public void setVencimentoProduto(Date VencimentoProduto) {
        this.VencimentoProduto = VencimentoProduto;
    }
}
