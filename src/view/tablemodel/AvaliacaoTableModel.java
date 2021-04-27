/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Avaliacao;

/**
 *
 * @author be_ha
 */
public class AvaliacaoTableModel extends AbstractTableModel{
    
    private ArrayList<Avaliacao> listaAvaliacoes;

    public AvaliacaoTableModel(ArrayList<Avaliacao> listaAvaliacaos) {
        this.listaAvaliacoes = listaAvaliacaos;
    }
        
    @Override
    public int getRowCount() {
        return listaAvaliacoes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Avaliacao avaliacao = listaAvaliacoes.get(rowIndex);
        System.out.println("avaliação");
        System.out.println(avaliacao);
        
        switch (columnIndex){
            case 0:
                return avaliacao.getCliente().getNomeCliente();
            case 1: 
                return avaliacao.getDescricaoAvaliacao();
            case 2: 
                return avaliacao.getNotaAvaliacao() + " de 5";
            default: 
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "Cliente";
            case 1 : return "Descrição";
            case 2 : return "Nota";
            default : return "";
        }
    }
    
    public Avaliacao getAvaliacao(int row) {
        return listaAvaliacoes.get(row);
    }
}
