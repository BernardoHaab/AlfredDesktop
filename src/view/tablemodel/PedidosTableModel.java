/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.tablemodel;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author be_ha
 */
public class PedidosTableModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getColumnName(int column) {
       switch (column){
            case 0 : return "Cliente";
            case 1 : return "Valor Total";
            case 2 : return "Endereço";
            default : return "";
        }
    }
}
