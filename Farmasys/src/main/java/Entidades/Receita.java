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
class Receita {
    private int numeroReceita;
    private boolean liberacaoRemedio;

    public int getNumeroReceita() {
        return numeroReceita;
    }

    public void setNumeroReceita(int numeroReceita) {
        this.numeroReceita = numeroReceita;
    }

    public boolean isLiberacaoRemedio() {
        return liberacaoRemedio;
    }

    public void setLiberacaoRemedio(boolean liberacaoRemedio) {
        this.liberacaoRemedio = liberacaoRemedio;
    }
    
    
}
