/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelDominio.Prato;

/**
 *
 * @author be_ha
 */
public class PratosTableModel extends AbstractTableModel{

    private ArrayList<Prato> listaPratos;

    public PratosTableModel(ArrayList<Prato> listaPratos) {
        this.listaPratos = listaPratos;
    }
        
    @Override
    public int getRowCount() {
        return listaPratos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prato prato = listaPratos.get(rowIndex);
        
        switch (columnIndex){
            case 0:
                return prato.getNomePrato();
            case 1: 
                return prato.getDescricaoPrato();
            case 2: 
                return prato.getValorPratoString();
            default: 
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "Nome";
            case 1 : return "Descrição";
            case 2 : return "Preço";
            default : return "";
        }
    }
    
    public Prato getPrato(int row) {
        return listaPratos.get(row);
    }
}
